package packageA;

import packageA.variable.util.*;
import packageA.variable.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import packageA.JavaParser.ArrayInitializerContext;
import packageA.JavaParser.BaseDeclarationContext;
import packageA.JavaParser.Boolean_expressionContext;
import packageA.JavaParser.ConditionalContext;
import packageA.JavaParser.ConstDeclarationContext;
import packageA.JavaParser.ConstantDeclaratorContext;
import packageA.JavaParser.DataTypeContext;
import packageA.JavaParser.ExpressionContext;
import packageA.JavaParser.ExpressionListContext;
import packageA.JavaParser.FieldDeclarationContext;
import packageA.JavaParser.GenericMethodDeclarationContext;
import packageA.JavaParser.LocalVariableDeclarationContext;
import packageA.JavaParser.LocalVariableDeclarationStatementContext;
import packageA.JavaParser.Math_expressionContext;
import packageA.JavaParser.MethodBodyContext;
import packageA.JavaParser.MethodCallContext;
import packageA.JavaParser.MethodDeclarationContext;
import packageA.JavaParser.ParameterContext;
import packageA.JavaParser.ParameterListContext;
import packageA.JavaParser.ParametersContext;
import packageA.JavaParser.ReturnStatementContext;
import packageA.JavaParser.SetContext;
import packageA.JavaParser.SetStatementContext;
import packageA.JavaParser.StatementContext;
import packageA.JavaParser.TypeTypeContext;
import packageA.JavaParser.VariableAssignmentContext;
import packageA.JavaParser.VariableDeclaratorContext;
import packageA.JavaParser.VariableDeclaratorIdContext;
import packageA.JavaParser.VariableInitializerContext;
import packageA.collector.OutputCollector;
import packageA.collector.StandardInputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.ConstantEditError;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.error.MultipleVariableDeclarationError;
import packageA.error.ReferencingError;
import packageA.error.VariableNotFoundError;
import packageA.function.BooleanUtil;
import packageA.function.FunctionDictionary;
import packageA.function.MathUtil;
import packageA.function.PatternDictionary;
import packageA.function.StringUtil;
import packageA.pointers.PointerManager;
import packageA.storage.Storage;

public class MyVisitor extends JavaBaseVisitor<Float> {

	public static final String REFERENCE_SET_CONTEXT = "set";
	public static final String REFERENCE_STATEMENT_CONTEXT = "stmt";
	public static final String REFERENCE_SET_STATEMENT_CONTEXT = "set_stmt";
	
	private JavaLexer lexer;
	private CommonTokenStream tokens;
	private JavaBaseErrorListener javaErrorListener;
	private ANTLRErrorStrategy defaultStrat;
	private JavaParser parser;
	private ParseTree tree;
	
	String tempType = "";
	
	ArrayList <MethodDeclarationContext> methodList = new ArrayList<MethodDeclarationContext> ();
	
    public String visit(String userInput) {
    	StringBuilder sb = new StringBuilder("");
    	
    	lexer = new JavaLexer(CharStreams.fromString(userInput));
        
        tokens = new CommonTokenStream(lexer);
        
        javaErrorListener = new JavaBaseErrorListener();
        SyntaxErrorCollector.getInstance().reset();
        
        defaultStrat = new DefaultErrorStrategy();
        
        parser = new JavaParser(tokens);
        parser.addErrorListener(javaErrorListener);
        parser.setErrorHandler(defaultStrat);
        
        tree = parser.code();
        
        System.out.println("IN CONSOLE");
        System.out.println(tree.toString());
        
        Token curr = lexer.getToken();
        sb.append(curr.getText())
    	.append(" | ")
    	.append(JavaLexer.VOCABULARY.getSymbolicName(curr.getType()))
    	.append(System.getProperty("line.separator"));
        
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
        	System.out.println("COUNT");
            sb.append(token.getText())
            	.append(" | ")
            	.append(JavaLexer.VOCABULARY.getSymbolicName(token.getType()))
            	.append(System.getProperty("line.separator"));
        }
        
        MyVisitor visitor = new MyVisitor();
        
        System.out.println("START\n");
        
        visitor.visit(tree);
        
        System.out.println("\nEND");
        	    
        System.out.println(sb);
        return sb.toString();
    }

    public JavaLexer getLexer() {
		return lexer;
	}

	public void setLexer(JavaLexer lexer) {
		this.lexer = lexer;
	}

	public CommonTokenStream getTokens() {
		return tokens;
	}

	public void setTokens(CommonTokenStream tokens) {
		this.tokens = tokens;
	}

	public JavaBaseErrorListener getJavaErrorListener() {
		return javaErrorListener;
	}

	public void setJavaErrorListener(JavaBaseErrorListener javaErrorListener) {
		this.javaErrorListener = javaErrorListener;
	}

	public ANTLRErrorStrategy getDefaultStrat() {
		return defaultStrat;
	}

	public void setDefaultStrat(ANTLRErrorStrategy defaultStrat) {
		this.defaultStrat = defaultStrat;
	}

	public JavaParser getParser() {
		return parser;
	}

	public void setParser(JavaParser parser) {
		this.parser = parser;
	}

	public ParseTree getTree() {
		return tree;
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
	}

    @Override
    public Float visitStatement(StatementContext ctx) {
    
        int total = ctx.getChildCount();
        for(int i = 0; i < total; i++) {
            
//            System.out.println("OUTSIDE");
            System.out.println(ctx.getChild(i).getText());
            switch(ctx.getChild(i).getText()) {
                case FunctionDictionary.FUNCTION_PRINT:
                	System.out.println("\t\t\t\t\tAT VISIT STATEMENT");
//                    System.out.println("INSIDE");
                	/*
                    if(i+1 < ctx.getChildCount()) {
                        //System.out.println("ADDING " + ctx.getChild(i+2).getText());
                    	if(ctx.getChild(i+1).getChild(1).getText().charAt(0) == '"')
                    		OutputCollector.getInstance().append((StringUtil.constructStringFromPrintStatement(ctx.getChild(i+1).getChild(1).getText())));
                    	else{
                    		Variable v;
							try {
								v = VariableManager.searchVariable(ctx.getChild(i+1).getChild(1).getText(), constructVariableScope(ctx));
								OutputCollector.getInstance().append((StringUtil.constructStringFromPrintStatement(v.getValue().getValue().toString() + "\n")));
							} catch (VariableNotFoundError e) {
								e.printStackTrace();
							}
                    	}
                    }
                    */
                	System.out.println("MY CURR CONTENT IN VISIT IS: " + ctx.getText());
                	String argument = ctx.getChild(i+2).getText();
                	System.out.println("MY ARGUMENT IS " + argument);
                	ParseTree parseTreeArguments = ctx.getChild(i+2);
                	System.out.println("MY ARGUMENT IS " + parseTreeArguments.getText());
                	
                	String[] segments = argument.split("\\+");
                	System.out.println(segments.length);
                	StringBuilder sb = new StringBuilder();
                	
                	System.out.println("SEGMENTS: " + segments[0]);
                	for(int j = 0; j < parseTreeArguments.getChildCount(); j+=2) {
                		System.out.println("SEGMENT:dick" + parseTreeArguments.getChild(j).getText() + "dick");
                		
                		System.out.println("Examining " + parseTreeArguments.getChild(j).getText());
                		if(parseTreeArguments.getChild(j).getText().charAt(0) == '"') {
                			System.out.println("IF 1");
                			//if(segments[j].charAt(0) == '"') {
                			sb.append(StringUtil.constructStringFromPrintStatement(parseTreeArguments.getChild(j).getText()));
//                			System.out.println("LITERAL");
//                			if(parseTreeArguments.getChild(j).getText().startsWith("\"") && parseTreeArguments.getChild(j).getText().endsWith("\"")) {
//                				sb.append(parseTreeArguments.getChild(j).getText().substring(1, parseTreeArguments.getChild(j).getText().length()-1));
//                			}else {
//                				sb.append(parseTreeArguments.getChild(j).getText());
//                			}
                		}
                		else if(Pattern.matches(PatternDictionary.ARRAY_PATTERN, parseTreeArguments.getChild(j).getText())){
                			try {
								Variable var = VariableManager.searchVariable(ctx.getChild(i+2).getChild(j).getChild(0).getText(), constructVariableScope(ctx));
								int index = Integer.parseInt(ctx.getChild(i+2).getChild(j).getChild(2).getText());
								String varValue = (String)var.getValue().getValue();
								String[] value = varValue.split(",");
								sb.append(value[index]);
							} catch (VariableNotFoundError e) {
								//OutputCollector.getInstance().append("No variable " + ctx.getChild(i+2).getChild(j).getChild(0).getText() + " was found");
								OutputCollector.getInstance().append("No variable " + ctx.getChild(0).getChild(0).getText() + " was found");
							}
                		}
                		else if(parseTreeArguments.getChild(j).getChildCount() > 1){
                			System.out.println("IF 2");
                			System.out.println("BEFORE");
                			System.out.println("TO VIEW " + parseTreeArguments.getText());
                			float result = visitMath_expression((Math_expressionContext) parseTreeArguments.getChild(j));
                			System.out.println("GOT " + result);
                			sb.append(result);
                			
                		} else {
                			System.out.println("IF 3");
                			try {
                				if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, parseTreeArguments.getChild(j).getText())) {
                					sb.append(parseTreeArguments.getChild(j).getText());
                				}
                				else {
                					System.out.println("constructVariableScope(ctx): " + constructVariableScope(ctx));
                					if(VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)) != null) {
                						System.out.println("VARIABLE");
                						String vartype = VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getVarType();
                						if(vartype.equals("string")){
                							String temp = VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getValue().getValue().toString();
                							sb.append(temp.substring(1, temp.length()-1));
                						}
                						else if(vartype.equals("char")){
                							String temp = VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getValue().getValue().toString();
                							if(temp.length() != 1) {
                								temp = temp.substring(1, temp.length()-1);
                							}
                							sb.append(temp);
                						}
                						else
                							sb.append(VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getValue().getValue().toString());
                					}
                					else {
                						System.out.println("NANI");
                						sb.append(visit(parseTreeArguments.getChild(j).getText()));
                					}
                				}
                			} catch (VariableNotFoundError e) {
                				//OutputCollector.getInstance().append("No such variable found");
                				OutputCollector.getInstance().append("No variable " + ctx.getChild(0).getChild(0).getText() + " was found");
                				
                			}
                		}
                		

                        System.out.println("work okay: " + parseTreeArguments.getChild(j).getText());
                	}
                	OutputCollector.getInstance().append(sb.toString());
                	return (float)0;
                case FunctionDictionary.FUNCTION_SCAN:
//                  System.out.println(ctx.getText());
                    String varSimpleName = ctx.inputReceiver.getText();
                    String varFormat = ctx.inputFormat.getText();
                    String varValue= "";
                    System.out.println("VAR FORMAT IS " + varFormat);
                    switch(varFormat) {
                        case FunctionDictionary.FUNCTION_SCAN_WHOLELINE: 
                            varValue = StandardInputCollector.getInstance().getNextLine();
                            break;
                        case FunctionDictionary.FUNCTION_SCAN_NEXT:
                            varValue = StandardInputCollector.getInstance().getNext();
                            break;
                        default:
                            varValue = StandardInputCollector.getInstance().getNext();
                    }
                    System.out.println("VAR VALUE  IS " + varValue);
                    if(varValue != null) {
                        assignValueToVariable(ctx, varSimpleName, -1, varValue);
                    }else {
                        throw new NoSuchElementException();
                    }
                	break;
                	
                case FunctionDictionary.FUNCTION_POINTER_SET:
                    try {
                        System.out.println(ctx.getText());
                        System.err.println("tht's for set pointer");
                        System.out.println(ctx.getChild(i+2).getText());
                        System.err.println("tht's for i+2");
                        
                        Float output = 0f;
                        if(ctx.getChild(i+2).getChildCount() > 0) {                            
                            output = visit(ctx.getChild(i+2));
                        }else {
                            output = Float.valueOf(ctx.getChild(i+2).getText());
                        }
                        System.out.println("RESULT IS " + output);
                        
                        int addressToSet = Math.round(output);
						Variable variable = VariableManager.searchVariable(ctx.variable.getText(), constructVariableScope(ctx));
						PointerManager.setAddress(addressToSet, variable);
					} catch (VariableNotFoundError e1) {
						SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new VariableNotFoundError(ctx.variable.getText()).getErrorMessage());
						e1.printStackTrace();
					}
					return 0f;
					
                case FunctionDictionary.FUNCTION_POINTER_GET:
                    Float output = 0f;
                    if(ctx.getChild(i+2).getChildCount() > 0) {                            
                        output = visit(ctx.getChild(i+2));
                    }else {
                        output = Float.valueOf(ctx.getChild(i+2).getText());
                    }
                    System.out.println("RESULT IS " + output);
                    
                    int addressToGet = Math.round(output);
					Variable variable = PointerManager.getVariableAtAddress(addressToGet);
                	return 0f;
                	
                case FunctionDictionary.FUNCTION_POINTER_FREE:
                    Float freeOutput = 0f;
                    if(ctx.getChild(i+2).getChildCount() > 0) {                            
                        freeOutput = visit(ctx.getChild(i+2));
                    } else {
                        freeOutput = Float.valueOf(ctx.getChild(i+2).getText());
                    }
                    System.out.println("RESULT IS " + freeOutput);
                    
                    int addressToFree = Math.round(freeOutput);
					PointerManager.clearAddress(addressToFree);
					
					return 0f;
					
//                case FunctionDictionary.FUNCTION_RETURN:
//                	ctx.methodDeclaration().statements.set().setStatement().state
//                	return 0f;
                default: 
//                	System.out.println("DEFAULT " + i + " : " + ctx.getChild(i).getText() + " \t|\t " + ctx.getChild(i).getClass().getSimpleName()); 
            }
        }
        
    
        return super.visitStatement(ctx);
    }
    
    
    

	
	public static String getDataType(TypeTypeContext typeType) {
		return null;
	}

	/*************************************************************************************************/
	/* 003. VARIABLE INITIALIZATIONS AND DECLARATIONS                                                */
	/*************************************************************************************************/	
	@Override
	public Float visitFieldDeclaration(FieldDeclarationContext ctx) {
		System.out.println("TRYING TO DECLARE");
		int total = ctx.getChildCount();
		
		String varType = ValueUtil.getDataType(ctx.typeType()); 
		String varSimpleName = ctx.variableDeclarator().varName.getText();
		String varValue = null;
		if(ctx.variableDeclarator().varValue != null) {
			varValue = ctx.variableDeclarator().varValue.getText();
		}
		
		declareVariable(ctx, varSimpleName, varType, varValue, false);
		return super.visitFieldDeclaration(ctx);
	}
	
	
	@Override
	public Float visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
//		System.out.println("LOCAL VAR");
		int total = ctx.getChildCount();

		String varType = ValueUtil.getDataType(ctx.typeType()); 
		String varSimpleName = ctx.variableDeclarator().varName.getText();
		String varValue = null;
		if(ctx.variableDeclarator().varValue != null) {
			System.out.println("\t\t\tAT VARVALE IF");
			varValue = ctx.variableDeclarator().varValue.getText();
			
			if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getChildCount() == 1) {
				declareVariable(ctx, varSimpleName, varType, varValue, false);
			}
			else if(ctx.variableDeclarator().variableInitializer().getChild(0).getClass().getSimpleName().equals(ExpressionContext.class.getSimpleName())) {
//				System.out.println("DECLARING 2");
//				System.out.println("I CAN'T IT'S " + ctx.variableDeclarator().variableInitializer().getChild(0).getClass().getSimpleName());
//				
//				System.out.println("UHHH IN EXPRESSION CONTEXT, IT'S " + ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName());
				if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName().equals(Math_expressionContext.class.getSimpleName())) {
					float ans = visitMath_expression((Math_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0));
//					System.out.println("ANSWER: " + ans);
					declareVariable(ctx, varSimpleName, varType, ""+ans, false);
				}else if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName().equals(Boolean_expressionContext.class.getSimpleName())) {
//					System.out.println("BOOLEAN");
					boolean ans = visitBoolean_expression((Boolean_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0)) == 1 ? true: false;
//					System.out.println("ANSWER: " + ans);
					declareVariable(ctx, varSimpleName, varType, ""+ans, false);
				}
				
			}
			else if(ctx.variableDeclarator().variableInitializer().getChild(0).getClass().getSimpleName().equals(ArrayInitializerContext.class.getSimpleName())) {
				System.out.println("ARRAY");
				
				ArrayList ans = new ArrayList();
				
				for(int i = 1; i < ctx.variableDeclarator().variableInitializer().getChild(0).getChildCount(); i = i + 2) {
					String value = ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getText();
					
					System.out.println("THINGO " + ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getText());
					if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getChildCount() > 1) {
						if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getClass().getSimpleName().equals(Math_expressionContext.class.getSimpleName())) {
							float arrayAns = visitMath_expression((Math_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0));
							
							ans.add(arrayAns);
						}
						else if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getClass().getSimpleName().equals(Boolean_expressionContext.class.getSimpleName())) {
							boolean arrayAns = visitBoolean_expression((Boolean_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0))  == 1 ? true: false;
							
							ans.add(arrayAns);
						}
					}
					else {
						if(ValueUtil.isMatch(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getText(), PatternDictionary.INTEGER_PATTERN)) {
							if(varType.equals("int")) {
								ans.add(value);
							}
						} 
						else if(ValueUtil.isMatch(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getText(), PatternDictionary.FLOAT_PATTERN)) {
							if(varType.equals("float")) {
								ans.add(value);
							}
						}
						else if(ValueUtil.isMatch(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getText(), PatternDictionary.BOOLEAN_PATTERN)) {
							if(varType.equals("boolean")) {
								ans.add(value);
							}
						}
						else if(ValueUtil.isMatch(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getText(), PatternDictionary.CHAR_PATTERN)) {
							if(varType.equals("char")) {
								ans.add(value);
							}
						}
						else if(ValueUtil.isMatch(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(i).getChild(0).getChild(0).getText(), PatternDictionary.STRING_PATTERN)) {
							if(varType.equals("string")) {
								ans.add(value);
							}
						}
					}
				}
				
				System.out.println("ARRAYDECLARE");
				
				varType = varType + "[]";
				declareVariable(ctx, varSimpleName, varType, ""+ans, false);
			}
//				else {
//				System.out.println("I WANT TO EVALUATE "+ctx.variableDeclarator().variableInitializer().getText() + " with class of " + ctx.variableDeclarator().variableInitializer().getClass().getSimpleName());
//				if(ctx.variableDeclarator().variableInitializer().getChild(0).getClass().getSimpleName().equals(ExpressionContext.class.getSimpleName())) {
//					if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName().equals(Math_expressionContext.class.getSimpleName())) {
//						int ans = visitMath_expression((Math_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0));
//						System.out.println("ANSWER: " + ans);
//						assignValueToVariable(ctx, varSimpleName, ""+ans);					
//					}else if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName().equals(Boolean_expressionContext.class.getSimpleName())) {
//						boolean ans = visitBoolean_expression((Boolean_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0)) == 1 ? true: false;
//						System.out.println("ANSWER: " + ans);
//						assignValueToVariable(ctx, varSimpleName, ""+ans);										
//					}
//					
//				}
//			}
		}else{
			
			declareVariable(ctx, varSimpleName, varType, varValue, false);
		}
		return super.visitLocalVariableDeclaration(ctx);
	}

	@Override
	public Float visitConstDeclaration(ConstDeclarationContext ctx) {
		System.out.println("DECLARING CONSTANT");
		int total = ctx.getChildCount();

		String conType = ctx.conType.getText(); 
		String conSimpleName = ctx.constantDeclarator().conName.getText();
		String conValue = null;
		if(ctx.constantDeclarator().conValue != null) {
			conValue = ctx.constantDeclarator().conValue.getText();
		}
		
		declareVariable(ctx, conSimpleName, conType, conValue, true);
		return super.visitConstDeclaration(ctx);
	}
	
	public Integer declareVariable(ParserRuleContext ctx, String varSimpleName, String varType, String varValue, boolean isConst) {
		System.out.println("DECLARED VARIABLE VALUE");
		System.out.println(varValue);
		
		Variable toStore = null;
		try {
			toStore = new Variable(constructVariableScope(ctx), varSimpleName, new Value(varType, varValue, isConst));
			VariableManager.addVariable(toStore);
			return 0;
		} catch (MultipleVariableDeclarationError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new MultipleVariableDeclarationError(toStore.getVarSimpleName()).getErrorMessage());
			e.printStackTrace();
		} catch( IncompatibleVariableDataTypeError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new IncompatibleVariableDataTypeError(varType, ValueUtil.inferVarType(varValue)).getErrorMessage());
			e.printStackTrace();
		} catch (ConstantEditError e) {
			// TODO Auto-generated catch block
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ConstantEditError(toStore.getVarName()).getErrorMessage());
			e.printStackTrace();
		}
		return -1;
	}
	
	public Integer declareVariable(String scope, String varSimpleName, String varType, String varValue, boolean isConst, ParserRuleContext ctx) {
		Variable toStore = null;
		try {
			
			toStore = new Variable(scope, varSimpleName, new Value(varType, varValue, isConst));
			VariableManager.addVariable(toStore);
			return 0;
		} catch (MultipleVariableDeclarationError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ConstantEditError(toStore.getVarName()).getErrorMessage());
			e.printStackTrace();
		} catch( IncompatibleVariableDataTypeError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ConstantEditError(toStore.getVarName()).getErrorMessage());
			System.out.println("INCOMPATIBLE");
			e.printStackTrace();
		} catch (ConstantEditError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ConstantEditError(toStore.getVarName()).getErrorMessage());
			// TODO Auto-generated catch block
			System.out.println("EDIT ERROR");
		}
		return -1;
	}

	/*************************************************************************************************/
	/* 007. VARIABLE ASSIGNMENT                                                                      */
	/*************************************************************************************************/
	@Override
	public Float visitVariableAssignment(VariableAssignmentContext ctx) {
//		System.out.println("HERE AT VARIABLES");
		String varSimpleName = ctx.varName.getText();
		String varValue = ctx.varValue.getText();
		int varIndex = -1;
		if(ctx.varIndex != null) {
			System.out.println("INDEX - IT IS FOUND");
			if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, ctx.varIndex.getText())) {
				varIndex = Integer.valueOf(ctx.varIndex.getText());
			}			
		}else {
			System.out.println("INDEX - IT IS NOT FOUND");
		}
		
//		System.out.println("CHILDCOUNT: " + ctx.varValue.getChild(0).getChild(0).getChildCount());
//		for(int i = 0; i < ctx.varValue.getChild(0).getChild(0).getChildCount(); i++) {
//			System.out.println("CHILD " + i + ": " + ctx.varValue.getChild(0).getChild(0).getChild(i).getText());
//		}
		
		if(ctx.varValue.getChild(0).getChild(0).getChildCount() == 1 && 
				!ValueUtil.inferVarType(ctx.varValue.getChild(0).getText()).equals("unknown")) {
		//if(ctx.varValue.getChild(0).getChild(0).getChildCount() == 1) {
			assignValueToVariable(ctx, varSimpleName, varIndex, varValue);
		}else {
//			System.out.println("I WANT TO EVALUATE "+ctx.varValue.getText() + " with class of " + ctx.varValue.getClass().getSimpleName());
			if(ctx.varValue.getChild(0).getClass().getSimpleName().equals(ExpressionContext.class.getSimpleName())) {
				if(ctx.varValue.getChild(0).getChild(0).getClass().getSimpleName().equals(Math_expressionContext.class.getSimpleName())) {
					float ans = visitMath_expression((Math_expressionContext)ctx.varValue.getChild(0).getChild(0));
//					System.out.println("ANSWER: " + ans);
					assignValueToVariable(ctx, varSimpleName, varIndex, ""+ans);					
				}else if(ctx.varValue.getChild(0).getChild(0).getClass().getSimpleName().equals(Boolean_expressionContext.class.getSimpleName())) {
					boolean ans = visitBoolean_expression((Boolean_expressionContext)ctx.varValue.getChild(0).getChild(0)) == 1 ? true: false;
//					System.out.println("ANSWER: " + ans);
					assignValueToVariable(ctx, varSimpleName, varIndex, ""+ans);										
				}
				
			}
		}
		
		return super.visitVariableAssignment(ctx);
	}
	
	public Integer assignValueToVariable(ParserRuleContext ctx, String varSimpleName, int varIndex, String varValue){
		Variable toEdit = null;
		try {
			toEdit = VariableManager.searchVariable(varSimpleName, constructVariableScope(ctx));
			if(varIndex > -1) {
				VariableManager.storeValueToVariableArray(toEdit, varIndex, new Value(ValueUtil.inferVarType(varValue), varValue, false));	
			}else {
				System.out.println("VALUE TYPE: " + ValueUtil.inferVarType(varValue));
				VariableManager.storeValueToVariable(toEdit, new Value(ValueUtil.inferVarType(varValue), varValue, false));				
			}
			return 0;
		} catch (VariableNotFoundError e1) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new VariableNotFoundError(varSimpleName).getErrorMessage());
			e1.printStackTrace();
		} catch (IncompatibleVariableDataTypeError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new IncompatibleVariableDataTypeError(toEdit.getValue().getType(), ValueUtil.inferVarType(varValue)).getErrorMessage());
			e.printStackTrace();
		} catch (ConstantEditError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ConstantEditError(varSimpleName).getErrorMessage());
		} catch (ReferencingError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ReferencingError(varSimpleName).getErrorMessage());
			e.printStackTrace();
		}
		return -1;
	}
	
	/*************************************************************************************************/
	/* 009. IF STATEMENTS                                                                            */
	/*************************************************************************************************/	
	
	
	@Override
	public Float visitVariableInitializer(VariableInitializerContext ctx) {
//		System.out.println("here at variable initializer");
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableInitializer(ctx);
	}
	
    @Override
    public Float visitConditional(ConditionalContext ctx) {
    	System.out.println("VISITCONDITIONAL");
//    	for(int i=0; i<ctx.getChildCount(); i++)
//    		System.out.println(i + " : " + ctx.getChild(i).getText() + " : " + ctx.getChild(i).getClass().getSimpleName());
    	
    	if(ctx.getChild(0).getText().equals("if")){
    		System.out.println("IF STATEMENT");
    		boolean isExecuteIf = visitBoolean_expression(ctx.condition) == 1 ? true: false;
//            System.out.println("CONDITIONAL FOUND : " + isExecuteIf );
            if(isExecuteIf){
//            	System.out.println("here trying");
            	return visitStatement(ctx.ifAction);
            	/*
                if(ctx.ifAction.getClass().getSimpleName().equals(ConditionalContext.class.getSimpleName())){
                	System.out.println("here trying");
                	visitStatement(ctx.ifAction);
                    //visitConditional((ConditionalContext)ctx.ifAction);
                }else{
                    
                }
                */
            }else {
            	return visitStatement(ctx.elseAction);
            }
    	}
    	else if(ctx.getChild(0).getText().equals("while")){
    		System.out.println("WHILE STATEMENT");
    		Boolean isExecuteWhile = true;
    		while(isExecuteWhile){
    			System.out.println("\t\tWHILE FOUND : " + isExecuteWhile );
	    			System.out.println("\t\there trying");
	            	visitStatement(ctx.ifAction);
	            	isExecuteWhile = visitBoolean_expression(ctx.condition) == 1 ? true: false;
    		}
    		System.out.println("DONE DONE DONE");
    	}
    	else if(ctx.getChild(0).getText().equals("dowhile")){
    		System.out.println("DOWHILE STATEMENT");
    		Boolean isExecuteWhile = true;
    		do{
    			System.out.println("\t\tWHILE FOUND : " + isExecuteWhile );
	    			System.out.println("\t\there trying");
	            	visitStatement(ctx.ifAction);
	            	isExecuteWhile = visitBoolean_expression(ctx.condition) == 1 ? true: false;
    		}while(isExecuteWhile);
    		System.out.println("DONE DONE DONE");
    	}
    	else if(ctx.getChild(0).getText().equals("for")) {
    		//System.out.println("FUCK SHIT" + ctx.getChild(2).getChild(0).getText());
    		visit(ctx.control.getChild(0));
    		Boolean isExecuteWhile = true;
    		
    		while(isExecuteWhile) {
    			System.out.println("\t\there trying");
    			System.out.println("ifAction text is: " + ctx.ifAction.getText());
            	visitStatement(ctx.ifAction);
            	visit(ctx.control.getChild(4));
            	System.out.println("CONDITION" + ctx.control.condition.getText());
            	isExecuteWhile = visitBoolean_expression(ctx.control.condition) == 1 ? true: false;
    		}
    	}
    	else {
    		return super.visitConditional(ctx);
    	}
    	return null;
    }

	
	/*************************************************************************************************/
	/* 011. BOOLEAN EXPRESSIONS                                                                      */
	/*************************************************************************************************/	
	@Override
	public Float visitBoolean_expression(Boolean_expressionContext ctx) {
		
		
//        for(int i = 0; i < ctx.getChildCount(); i++) {
//            System.out.println("CHILD " + i + ": " + ctx.getChild(i).getText());
//        }
		String toCompare = ctx.getText().trim();
		if(toCompare.equals("true")) {
			return (float)1;
		}else if(toCompare.equals("false")){
			return (float)0;
		}else {
			if(ctx.getChildCount() > 1) {
				System.out.println("TO COMPARE :" + ctx.left.getText() + ctx.op.getText() + ctx.right.getText());
				return BooleanUtil.solve(visitBoolean_expression(ctx.left), ctx.op.getText(), visitBoolean_expression(ctx.right)) ? (float)1 : (float)0;
			}else{
				if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, ctx.getChild(0).getText())) {
    				return Float.parseFloat(ctx.getChild(0).getText());
    			}
				else if(Pattern.matches(PatternDictionary.ARRAY_PATTERN, ctx.getChild(0).getText())){
	    			try {
						Variable var = VariableManager.searchVariable(ctx.getChild(0).getChild(0).getText(), constructVariableScope(ctx));
						int index = Integer.parseInt(ctx.getChild(0).getChild(2).getText());
						String varValue = (String)var.getValue().getValue();
						String[] value = varValue.split(",");
						System.out.println("FLIPPANT BEAVER: " + value[index]);
						return Float.parseFloat(value[index]);
					} catch (VariableNotFoundError e) {
						SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
					}
	    		}
				else {
    				try {
    					Variable var = VariableManager.searchVariable(ctx.getText(), constructVariableScope(ctx));
    					
    					if(var.getValue().getValue().toString().equals("true")) {
    						return (float)1;
    					}else {
    						return Float.valueOf(var.getValue().getValue().toString());
    					}
    						
    				} catch (VariableNotFoundError e) {
    					SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
    					e.printStackTrace();
    				} catch(NumberFormatException e1) {
    					SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e1.getMessage());
    					e1.printStackTrace(); 
    				}
    				return (float)-1;
    			}
			}
		}
		return null;
		
//		System.out.println("THIS IS: " + ctx.getText());
//		if(ctx.getChildCount() == 1) {
//			System.out.println("THE VALUE OF THE CONTEXT IS " + ctx.getText());
//            if(ctx.getText().equals("true")){
//                return 1;
//            }else if(ctx.getText().equals("false")){
//                return 0;
//            }else{
//            	
//            }
//		}else {
			
//			if(ctx.op != null) {
//				
//				if(ctx.left.getChildCount() == 1 && ctx.right.getChildCount() == 1) {
//					System.out.println(ctx.left.getChildCount() + " " + ctx.left.getText());
//					System.out.println(ctx.op.getText());
//					System.out.println(ctx.right.getChildCount() + " " + ctx.right.getText());
//					System.out.println("\t" + ctx.left.getText() + ctx.op.getText() + ctx.right.getText() + "? " + BooleanUtil.solve(Integer.valueOf(ctx.left.getText()), ctx.op.getText(), Integer.valueOf(ctx.right.getText())));
//					return BooleanUtil.solve(Integer.valueOf(ctx.left.getText()), ctx.op.getText(), Integer.valueOf(ctx.right.getText())) == true ? 1 : 0;
//				}else {
//					if(ctx.left.getChildCount() != 1) {
//						return visitBoolean_expression(ctx.left);
//					}
//					if(ctx.right.getChildCount() != 1) {
//						return visitBoolean_expression(ctx.right);
//					}
//				}
//			}	
//		}
//		
	}
	
	
	@Override
	public Float visitVariableDeclarator(VariableDeclaratorContext ctx) {
//		System.out.println("here at variable declarator with context" + ctx.getText());
//		
//		if(ctx.getChildCount() >=2)
//			VariableManager.addVariable(new Variable(tempType, "idk", ctx.getChild(0).getText(), ctx.getChild(2).getText()));
//		else
//			VariableManager.addVariable(new Variable(tempType, "idk", ctx.getChild(0).getText()));
//		
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableDeclarator(ctx);
	}
	
	
	
	@Override
	public Float visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
//		System.out.println("here at variable id");
		
		
//	
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableDeclaratorId(ctx);
	}
	
	@Override
	public Float visitDataType(DataTypeContext ctx) {
//		System.out.println("here at variable datatype");
//		tempType = ctx.getChild(0).getText();
//		
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitDataType(ctx);
	}
	
	@Override
	public Float visitMethodDeclaration(MethodDeclarationContext ctx) {
		return super.visitMethodDeclaration(ctx);
	}
	
	@Override
	public Float visitMath_expression(Math_expressionContext ctx) {
//		System.out.println("CHILDCOUNT: " + ctx.getChildCount());
//		for(int i = 0; i < ctx.getChildCount(); i++) {
//			System.out.println("CHILD " + i + ": " + ctx.getChild(i).getText());
//		}
		
		if(ctx.getChildCount() == 1){
			if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, ctx.getChild(0).getText())) {
				return Float.parseFloat(ctx.getChild(0).getText());
			}
			else if(Pattern.matches(PatternDictionary.ARRAY_PATTERN, ctx.getChild(0).getText())){
    			try {
					Variable var = VariableManager.searchVariable(ctx.getChild(0).getChild(0).getText(), constructVariableScope(ctx));
					int index = Integer.parseInt(ctx.getChild(0).getChild(2).getText());
					String varValue = (String)var.getValue().getValue();
					String[] value = varValue.split(",");
					return Float.parseFloat(value[index]);
				} catch (VariableNotFoundError e) {					
					SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
					e.printStackTrace();
				}
    		}
			else {
				try {
					return Float.parseFloat(VariableManager.searchVariable(ctx.getText(), constructVariableScope(ctx)).getValue().getValue().toString());
				} catch (VariableNotFoundError e) {
					SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
					e.printStackTrace();
				}			
				return (float)-1;
			}
		}
		else {
			return (float) MathUtil.solve(visitMath_expression(ctx.left), ctx.op.getText().charAt(0), visitMath_expression(ctx.right));
		}
		return null;
	}
	
	@Override
	public Float visitExpression(ExpressionContext ctx) {
		
//		
////		System.out.println();
////		System.out.println("EXPRESSION START");
////		System.out.println();
//		
//		int total = ctx.getChildCount();
//		for(int i = 0; i < total; i++) {
//			
//			switch(ctx.getChild(i).getText()) {
//				case FunctionDictionary.FUNCTION_PRINT:
//					System.out.println("\t\t\t\t\tAT VISIT EXPRESSION");
////					System.out.println("PRINTING HERE");
//					if(i+2 < ctx.getChildCount()) {
//						//System.out.println("ADDING " + ctx.getChild(i+2).getText());
//						OutputCollector.getInstance().append((StringUtil.constructStringFromPrintStatement(ctx.getChild(i+2).getText())));	
//					}
//					break;
//                case FunctionDictionary.FUNCTION_SCAN:
////                	System.out.println(ctx.getText());
//                    String varSimpleName = ctx.inputReceiver.getText();
//                    String varFormat = ctx.inputFormat.getText();
//                    String varValue= "";
//                    System.out.println("VAR FORMAT IS " + varFormat);
//                    switch(varFormat) {
//                        case FunctionDictionary.FUNCTION_SCAN_WHOLELINE: 
//                            varValue = StandardInputCollector.getInstance().getNextLine();
//                            break;
//                        case FunctionDictionary.FUNCTION_SCAN_NEXT:
//                            varValue = StandardInputCollector.getInstance().getNext();
//                            break;
//                        default:
//                            varValue = StandardInputCollector.getInstance().getNext();
//                    }
//                    System.out.println("VAR VALUE  IS " + varValue);
//                    if(varValue != null) {
//                        assignValueToVariable(ctx, varSimpleName, varValue);
//                    }else {
//                        throw new NoSuchElementException();
//                    }
//                	break;
//                    
//                
////                case FunctionDictionary.FUNCTION_FOR_LOOP:
////                	System.out.println();
////                	for(int j=0; j<ctx.getChildCount() ;j++)
////                		System.out.println(j + " : " + ctx.getChild(j));
////                		
////                	break;
//                default: 
////                	System.out.println("DEFAULT " + i + " : " + ctx.getChild(i).getText() + " \t|\t " + ctx.getChild(i).getClass().getSimpleName()); 
//			}
//		}
//		
////		System.out.println();
////		System.out.println("EXPRESSION END");
////		System.out.println();
//		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}
	
	
	public String constructVariableScope(ParserRuleContext ctx) {
//		System.out.println("here at var scope");
		ParserRuleContext parentFinder;
		StringBuilder varName = new StringBuilder();
		parentFinder = ctx.getParent();
		
		do {
			parentFinder = parentFinder.getParent();
			if(parentFinder.getClass().getSimpleName().equals(MethodDeclarationContext.class.getSimpleName())) {
				varName.append(new StringBuffer(parentFinder.getChild(2).getText()).reverse().toString()).append('$');
//			}else if(parentFinder.getClass().getSimpleName().equals(SetStatementContext.class.getSimpleName())) {
//				varName.append(new StringBuffer(REFERENCE_SET_STATEMENT_CONTEXT+parentFinder.getParent().children.indexOf(parentFinder)).reverse().toString()).append('$');
			}else if(parentFinder.getClass().getSimpleName().equals(StatementContext.class.getSimpleName())) {
				if(parentFinder.getParent().getClass().getSimpleName().equals(SetStatementContext.class.getSimpleName())) {
					//VERY EXPERIMENTAL
//					System.out.println("FOUND IT!!!");
					varName.append(new StringBuffer(REFERENCE_STATEMENT_CONTEXT+parentFinder.getParent().getParent().children.indexOf(parentFinder.getParent())).reverse().toString()).append('$');
				}else {
					System.out.println("NO SET STATEMENT");
					varName.append(new StringBuffer(REFERENCE_STATEMENT_CONTEXT+parentFinder.getParent().children.indexOf(parentFinder)).reverse().toString()).append('$');					
				}
			}else if(parentFinder.getClass().getSimpleName().equals(SetContext.class.getSimpleName())) {
				varName.append(new StringBuffer(REFERENCE_SET_CONTEXT+parentFinder.getParent().children.indexOf(parentFinder)).reverse().toString()).append('$');
			}
			
		}while(!parentFinder.getClass().getSimpleName().equals(BaseDeclarationContext.class.getSimpleName()));
		
		return new StringBuffer(varName.toString()).reverse().toString().substring(1, varName.length());
	}
	
	public String constructVariableName(ParserRuleContext ctx, String simpleName) {
		System.out.println("VAR IS " + (new StringBuilder()).append(constructVariableScope(ctx)).append("$").append(simpleName).toString());
		return (new StringBuilder()).append(constructVariableScope(ctx)).append("$").append(simpleName).toString();
	}
	
	
	@Override
	public Float visitBaseDeclaration(BaseDeclarationContext ctx) {
		ArrayList<Variable> variableList = new ArrayList<Variable> ();
		if(ctx.method.params.parameterList() != null){
			List<ParameterContext> paramCont = ctx.methodDeclaration().parameters().parameterList().parameter();
			
			for(int i=0; i<paramCont.size(); i++){
				try {
					StringBuilder sb = new StringBuilder();
                    sb.append(ctx.method.funcname.getText()).append("$set0");
                    
                    
                    Variable v = new Variable(sb.toString(), paramCont.get(i).vardec.getText(), new Value(paramCont.get(i).type.getText(), null, false));
//					Variable v = new Variable(constructVariableScope(paramCont.get(i)), paramCont.get(i).vardec.getText(), new Value(paramCont.get(i).type.getText(), null, false));
					variableList.add(v);
//					System.out.println("BASE DECLARED varName: " + v.getVarName());
					System.out.println(ctx.method.funcname.getText() + " BASE DECLARED varName: " + sb.toString());
				} catch (IncompatibleVariableDataTypeError e) {
					SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
					e.printStackTrace();
				} catch (ConstantEditError e) {
					SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
					e.printStackTrace();
				}
			}
		}
	
		Function f;
		try {
			if(ctx.method.returntype != null){
				f = new Function(ctx.method.funcname.getText() + '$', ctx.method.funcname.getText(),ctx.method.returntype.getText(), variableList, ctx.method.statements);
				FunctionManager.addFunction(f);
				f.printVariables();
			}
			
			else{ //void return
				f = new Function(ctx.method.funcname.getText() + '$', ctx.method.funcname.getText(),"", variableList, ctx.method.statements);
				FunctionManager.addFunction(f);
				f.printVariables();
			}
//			System.out.println("CONTEXT " + ctx.method.funcname.getText() + " : " + ctx.method.funcname.getText() + '$');
		} catch (MultipleVariableDeclarationError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
			e.printStackTrace();
		} catch (IncompatibleVariableDataTypeError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
			e.printStackTrace();
		}
		
		
		
		System.out.println("\t\t\t\t " + ctx.method.funcname.getText() + '$' + " RESULT : " +  ctx.method.statements.getText());
		return super.visitBaseDeclaration(ctx);
	}
	
	@Override
    public Float visitReturnStatement(ReturnStatementContext ctx) {
    	String ctxSamp = constructVariableName(ctx, ctx.retExp.getText());
    	System.out.println("\t\t\t\t\t SAMPLE:" + ctxSamp);
    	if(VariableManager.isExisting(ctxSamp)){
    		Variable v = VariableManager.getVariable(ctxSamp);
    		System.out.println("HELLO VALUE: " + v.getValue().getValue());
    		
    		if(FunctionManager.isExisting(ctx.funcname.getText())){
    			Function f = FunctionManager.getFunction(ctx.funcname.getText());
    			f.setRetObject(v);
    					
    		}
    		
    	}
    	
    	
    	return super.visitReturnStatement(ctx);
    }
	
	@Override
	public Float visitMethodCall(MethodCallContext ctx) {
		System.out.println("\t\t\t\t\tAT METHOD CALL");
		String funcName = ctx.funcname.getText();
		Function f = FunctionManager.getFunction(funcName);
		if(FunctionManager.isExisting(funcName)){
			System.out.println("DONE METHOD CALL STUFF");
			
			List<ExpressionContext> expList = ctx.passedParam.expression();
			System.out.println("expList : " + expList.size());
			f.printVariables();
			for(int i=0; i<expList.size(); i++){
				Variable temp = f.getParam(i);
				System.out.println("PARAM: " + f.getParam(i).getVarName());
				if(temp != null){
					Value tempval = temp.getValue();
					try {
						
						System.out.println("temp.getVarName: " + temp.getScope().toString());
						tempval.setValue(getExpValueMethodCall(expList.get(i).getText(), expList.get(i), ctx));
						temp.setValue(tempval);
						f.addVariable(temp);
					} catch (IncompatibleVariableDataTypeError e) {
						SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
						e.printStackTrace();
					} catch (ConstantEditError e) {
						SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
						e.printStackTrace();
					}
					
				}
			}
			f.printVariables();
			f.addValuesToStorage();
			
			visitMethodBody(f.getSc());
			
			if(ctx.getVal != null){
				
				String varname = constructVariableName(ctx, ctx.getVal.getText());
				Variable varSamp = VariableManager.getVariable(varname);
				System.out.println("\t\t\t\t\t\t\t NOT NULL : " + varname);
				try {
					varSamp.setValue(f.getRetObject().getValue());
				} catch (IncompatibleVariableDataTypeError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ConstantEditError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			else
				System.out.println("\t\t\t\t\t\t\tNULL");
			
			
			
		}
		else{
			System.out.println("\t\t\t NOT FOUND FUNCTION");
		}
		return super.visitMethodCall(ctx);
	}
	
	public String getExpValueMethodCall(String argument, ParseTree parseTreeArguments, MethodCallContext ctx){
		
    	String[] segments = argument.split("\\+");
    	StringBuilder sb = new StringBuilder();
    	
    	for(int j = 0; j < parseTreeArguments.getChildCount(); j+=2) {
    		if(parseTreeArguments.getChild(j).getText().charAt(0) == '"') {
    			System.out.println("TEST 1");
    			sb.append(StringUtil.constructStringFromPrintStatement(parseTreeArguments.getChild(j).getText()));
    		} else if(parseTreeArguments.getChild(j).getChildCount() > 1){
    			System.out.println("TEST 2");
    			float result = visitMath_expression((Math_expressionContext) parseTreeArguments.getChild(j));
    			System.out.println("GOT " + result);
    			sb.append(result);
    			
    		} else {
    			System.out.println("TEST 3");
    			try {
    				if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, segments[j])) {
    					sb.append(parseTreeArguments.getChild(j).getText());
    				}else { 
    					if(VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)) != null) {
    						System.out.println("VARIABLE");
    						sb.append(VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getValue().getValue().toString());
    					}
    					else {
    						System.out.println("NANI");
    						sb.append(visit(parseTreeArguments.getChild(j).getText()));
    					}
    				}
    			} catch (VariableNotFoundError e) {
    				SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), e.getErrorMessage());
    				
    			}
    		}
    		

            
            

    	}
    	
    	return sb.toString();
	}
	
}