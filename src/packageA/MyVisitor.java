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
import packageA.error.VariableNotFoundError;
import packageA.function.BooleanUtil;
import packageA.function.FunctionDictionary;
import packageA.function.MathUtil;
import packageA.function.PatternDictionary;
import packageA.function.StringUtil;

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
                	StringBuilder sb = new StringBuilder();
                	
                	for(int j = 0; j < parseTreeArguments.getChildCount(); j+=2) {
                		System.out.println("SEGMENT:dick" + parseTreeArguments.getChild(j).getText() + "dick");
                		
                		System.out.println("Examining " + parseTreeArguments.getChild(j).getText());
                		if(parseTreeArguments.getChild(j).getText().charAt(0) == '"') {
                			//if(segments[j].charAt(0) == '"') {
                			sb.append(StringUtil.constructStringFromPrintStatement(parseTreeArguments.getChild(j).getText()));
//                			System.out.println("LITERAL");
//                			if(parseTreeArguments.getChild(j).getText().startsWith("\"") && parseTreeArguments.getChild(j).getText().endsWith("\"")) {
//                				sb.append(parseTreeArguments.getChild(j).getText().substring(1, parseTreeArguments.getChild(j).getText().length()-1));
//                			}else {
//                				sb.append(parseTreeArguments.getChild(j).getText());
//                			}
                		} else if(parseTreeArguments.getChild(j).getChildCount() > 1){
                			System.out.println("BEFORE");
                			System.out.println("TO VIEW " + parseTreeArguments.getText());
                			float result = visitMath_expression((Math_expressionContext) parseTreeArguments.getChild(j));
                			System.out.println("GOT " + result);
                			sb.append(result);
                			
                		} else {
                			try {
                				if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, segments[j])) {
                					sb.append(parseTreeArguments.getChild(j).getText());
                				}else { 
                					if(VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)) != null) {
                						System.out.println("VARIABLE");
                						String vartype = VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getVarType();
                						if(vartype.equals("string")){
                							String temp = VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getValue().getValue().toString();
                							sb.append(temp.substring(1, temp.length()-1));
                						}
                						else if(vartype.equals("char")){
                							String temp = VariableManager.searchVariable(parseTreeArguments.getChild(j).getText(), constructVariableScope(ctx)).getValue().getValue().toString();
                							sb.append(temp.substring(1, temp.length()-1));
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
                				OutputCollector.getInstance().append("No such variable found");
                				
                			}
                		}
                		

                        System.out.println(parseTreeArguments.getChild(j).getText());
                	}
                	OutputCollector.getInstance().append(sb.toString() + "\n");
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
                        assignValueToVariable(ctx, varSimpleName, varValue);
                    }else {
                        throw new NoSuchElementException();
                    }
                	
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
		}
		return -1;
	}
	
	public Integer declareVariable(String scope, String varSimpleName, String varType, String varValue, boolean isConst) {
		Variable toStore = null;
		try {
			
			toStore = new Variable(scope, varSimpleName, new Value(varType, varValue, isConst));
			VariableManager.addVariable(toStore);
			return 0;
		} catch (MultipleVariableDeclarationError e) {
			System.out.println("MULTIPLE VAR");
			e.printStackTrace();
		} catch( IncompatibleVariableDataTypeError e) {
			System.out.println("INCOMPATIBLE");
			e.printStackTrace();
		} catch (ConstantEditError e) {
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
		
//		System.out.println("CHILDCOUNT: " + ctx.varValue.getChild(0).getChild(0).getChildCount());
//		for(int i = 0; i < ctx.varValue.getChild(0).getChild(0).getChildCount(); i++) {
//			System.out.println("CHILD " + i + ": " + ctx.varValue.getChild(0).getChild(0).getChild(i).getText());
//		}
		
		if(ctx.varValue.getChild(0).getChild(0).getChildCount() == 1) {
			assignValueToVariable(ctx, varSimpleName, varValue);
		}else {
//			System.out.println("I WANT TO EVALUATE "+ctx.varValue.getText() + " with class of " + ctx.varValue.getClass().getSimpleName());
			if(ctx.varValue.getChild(0).getClass().getSimpleName().equals(ExpressionContext.class.getSimpleName())) {
				if(ctx.varValue.getChild(0).getChild(0).getClass().getSimpleName().equals(Math_expressionContext.class.getSimpleName())) {
					float ans = visitMath_expression((Math_expressionContext)ctx.varValue.getChild(0).getChild(0));
//					System.out.println("ANSWER: " + ans);
					assignValueToVariable(ctx, varSimpleName, ""+ans);					
				}else if(ctx.varValue.getChild(0).getChild(0).getClass().getSimpleName().equals(Boolean_expressionContext.class.getSimpleName())) {
					boolean ans = visitBoolean_expression((Boolean_expressionContext)ctx.varValue.getChild(0).getChild(0)) == 1 ? true: false;
//					System.out.println("ANSWER: " + ans);
					assignValueToVariable(ctx, varSimpleName, ""+ans);										
				}
				
			}
		}
		
		return super.visitVariableAssignment(ctx);
	}
	
	public Integer assignValueToVariable(ParserRuleContext ctx, String varSimpleName, String varValue){
		Variable toEdit;
		try {
			toEdit = VariableManager.searchVariable(varSimpleName, constructVariableScope(ctx));
			VariableManager.storeValueToVariable(toEdit, new Value(ValueUtil.inferVarType(varValue), varValue, false));
			return 0;
		} catch (VariableNotFoundError e1) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new VariableNotFoundError(varSimpleName).getErrorMessage());
			e1.printStackTrace();
		} catch (IncompatibleVariableDataTypeError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new IncompatibleVariableDataTypeError(ValueUtil.inferVarType(varValue), ValueUtil.inferVarType(varValue)).getErrorMessage());
			e.printStackTrace();
		} catch (ConstantEditError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new ConstantEditError(varSimpleName).getErrorMessage());
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
    			}else {
    				try {
    					Variable var = VariableManager.searchVariable(ctx.getText(), constructVariableScope(ctx));
    					
    					if(var.getValue().getValue().toString().equals("true")) {
    						return (float)1;
    					}else {
    						return Float.valueOf(var.getValue().getValue().toString());
    					}
    						
    				} catch (VariableNotFoundError e) {
    					e.printStackTrace();
    				} catch(NumberFormatException e1) {
    					e1.printStackTrace(); 
    				}
    				return (float)-1;
    			}
			}
		}
		
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
			}else {
				try {
					return Float.parseFloat(VariableManager.searchVariable(ctx.getText(), constructVariableScope(ctx)).getValue().getValue().toString());
				} catch (VariableNotFoundError e) {
					e.printStackTrace();
				}			
				return (float)-1;
			}
		}
		else {
			return (float) MathUtil.solve(visitMath_expression(ctx.left), ctx.op.getText().charAt(0), visitMath_expression(ctx.right));
		}
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
					
					variableList.add(new Variable(ctx.method.funcname.getText() + '$', paramCont.get(i).vardec.getText(), new Value(paramCont.get(i).type.getText(), null, false)));
					System.out.println("BASE DECLARED " + ctx.method.funcname.getText() + " : " + ctx.method.funcname.getText() + '$');
				} catch (IncompatibleVariableDataTypeError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ConstantEditError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	
		try {
			if(ctx.method.returntype != null)
				FunctionManager.addFunction(new Function(ctx.method.funcname.getText() + '$', ctx.method.funcname.getText(),ctx.method.returntype.getText(), variableList, ctx.method.statements));
			
			else //void return
				FunctionManager.addFunction(new Function(ctx.method.funcname.getText() + '$', ctx.method.funcname.getText(),"", variableList, ctx.method.statements));
			System.out.println("CONTEXT " + ctx.method.funcname.getText() + " : " + ctx.method.funcname.getText() + '$');
		} catch (MultipleVariableDeclarationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncompatibleVariableDataTypeError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\t\t\t\tRESULT : " +  ctx.method.statements.getText());
		return super.visitBaseDeclaration(ctx);
	}
	
	@Override
	public Float visitMethodCall(MethodCallContext ctx) {
		System.out.println("\t\t\t\t\tAT METHOD CALL");
//		Function f = FunctionManager.getFunction(ctx.funcname.getText());
		String funcName = ctx.funcname.getText();
		if(FunctionManager.isExisting(funcName)){
			System.out.println("DONE METHOD CALL STUFF");
			
			List<ExpressionContext> expList = ctx.passedParam.expression();
			System.out.println("expList : " + expList.size());
			for(int i=0; i<expList.size(); i++){
				//assign value to parameter in function parameters
	            FunctionManager.getFunction(funcName).setFuncParameter(i, getExpValueMethodCall(expList.get(i).getText(), expList.get(i), ctx));
			}
			
//			public Integer declareVariable(String scope, String varSimpleName, String varType, String varValue, boolean isConst) {
			
			//declare variables
			ArrayList <Variable> paramList = FunctionManager.getParam(funcName);
			System.out.println("PARAM LIST");
			for(int i=0; i<paramList.size(); i++){
				declareVariable(FunctionManager.getFunction(funcName).getFuncScope(), 
								paramList.get(i).getVarSimpleName(),
								paramList.get(i).getVarType(),
								paramList.get(i).getValue().getValue().toString(),
								false);
				System.out.println(i  + " " + paramList.get(i).getVarSimpleName() + " : " + paramList.get(i).getValue().getValue().toString());
				
			}
			
			visitMethodBody(FunctionManager.getFunction(funcName).getSc());
			
			//delete variables
			VariableManager.removeVariable(FunctionManager.getFunction(funcName).getFuncScope());
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
    			sb.append(StringUtil.constructStringFromPrintStatement(parseTreeArguments.getChild(j).getText()));
    		} else if(parseTreeArguments.getChild(j).getChildCount() > 1){
    			float result = visitMath_expression((Math_expressionContext) parseTreeArguments.getChild(j));
    			System.out.println("GOT " + result);
    			sb.append(result);
    			
    		} else {
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
    				OutputCollector.getInstance().append("No such variable found");
    				
    			}
    		}
    		

            
            

    	}
    	
    	return sb.toString();
	}
	
}