package packageA;

import packageA.variable.util.*;
import packageA.variable.*;
import java.util.ArrayList;
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
import packageA.JavaParser.LocalVariableDeclarationContext;
import packageA.JavaParser.LocalVariableDeclarationStatementContext;
import packageA.JavaParser.Math_expressionContext;
import packageA.JavaParser.MethodBodyContext;
import packageA.JavaParser.MethodDeclarationContext;
import packageA.JavaParser.SetContext;
import packageA.JavaParser.SetStatementContext;
import packageA.JavaParser.StatementContext;
import packageA.JavaParser.TypeTypeContext;
import packageA.JavaParser.VariableAssignmentContext;
import packageA.JavaParser.VariableDeclaratorContext;
import packageA.JavaParser.VariableDeclaratorIdContext;
import packageA.JavaParser.VariableInitializerContext;
import packageA.collector.OutputCollector;
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

public class MyVisitor extends JavaBaseVisitor<Integer> {

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
    public Integer visitStatement(StatementContext ctx) {
    
        int total = ctx.getChildCount();
        for(int i = 0; i < total; i++) {
            
//            System.out.println("OUTSIDE");
            System.out.println(ctx.getChild(i).getText());
            switch(ctx.getChild(i).getText()) {
                case FunctionDictionary.FUNCTION_PRINT:
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
                	String argument = ctx.getChild(i+1).getChild(1).getChild(0).getText();
                	ParseTree parseTreeArguments = ctx.getChild(i+1).getChild(1).getChild(0);
                	System.out.println("MY ARGUMENT IS " + argument);
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
                			Integer result = visitMath_expression((Math_expressionContext) parseTreeArguments.getChild(j));
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
                		

                        System.out.println(parseTreeArguments.getChild(j).getText());
                	}
                	OutputCollector.getInstance().append(sb.toString());
                	return 0;
                case FunctionDictionary.FUNCTION_SCAN:
//                    System.out.println("SCANNING");
                    PopUpGUI pg = new PopUpGUI();
                    String input = pg.getInput();
//                    System.out.println("input is: " + input);
                    if(i + 1 < ctx.getChildCount()
//                     && ctx.getChild(i+1).getClass().getSimpleName().equals(ExpressionListContext.class.getSimpleName())
                     ){
                        
//                        String varScope = constructVariableScope(ctx);
//                        String varName = varScope + "$" + ctx.getChild(i+2).getChild(0).getText();
//                        System.out.println("SCAN SAYS: Scope of given variable is at " + varScope);
//                        System.out.println("SCAN SAYS: Entering value entered at variable " + varName);
//                        InputCollector.getInstance().store(, ctx.getChild(i+2).getChild(2).getText());
                    }
                    return 0;
//                case FunctionDictionary.FUNCTION_FOR_LOOP:
//                    System.out.println();
//                    for(int j=0; j<ctx.getChildCount() ;j++)
//                        System.out.println(j + " : " + ctx.getChild(j));
//                        
//                    break;
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
	public Integer visitFieldDeclaration(FieldDeclarationContext ctx) {
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
	public Integer visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
//		System.out.println("LOCAL VAR");
		int total = ctx.getChildCount();

		String varType = ValueUtil.getDataType(ctx.typeType()); 
		String varSimpleName = ctx.variableDeclarator().varName.getText();
		String varValue = null;
		if(ctx.variableDeclarator().varValue != null) {
			varValue = ctx.variableDeclarator().varValue.getText();
			
			if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getChildCount() == 1) {
//				System.out.println("DECLARING 1 : " + varValue);
				declareVariable(ctx, varSimpleName, varType, varValue, false);
			}
			else if(ctx.variableDeclarator().variableInitializer().getChild(0).getClass().getSimpleName().equals(ExpressionContext.class.getSimpleName())) {
//				System.out.println("DECLARING 2");
//				System.out.println("I CAN'T IT'S " + ctx.variableDeclarator().variableInitializer().getChild(0).getClass().getSimpleName());
//				
//				System.out.println("UHHH IN EXPRESSION CONTEXT, IT'S " + ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName());
				if(ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0).getClass().getSimpleName().equals(Math_expressionContext.class.getSimpleName())) {
					int ans = visitMath_expression((Math_expressionContext)ctx.variableDeclarator().variableInitializer().getChild(0).getChild(0));
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
	public Integer visitConstDeclaration(ConstDeclarationContext ctx) {
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
//			System.out.println("done adding var");
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

	/*************************************************************************************************/
	/* 007. VARIABLE ASSIGNMENT                                                                      */
	/*************************************************************************************************/
	@Override
	public Integer visitVariableAssignment(VariableAssignmentContext ctx) {
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
					int ans = visitMath_expression((Math_expressionContext)ctx.varValue.getChild(0).getChild(0));
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
	public Integer visitVariableInitializer(VariableInitializerContext ctx) {
//		System.out.println("here at variable initializer");
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableInitializer(ctx);
	}
	
    @Override
    public Integer visitConditional(ConditionalContext ctx) {
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
	public Integer visitBoolean_expression(Boolean_expressionContext ctx) {
		
		
//        for(int i = 0; i < ctx.getChildCount(); i++) {
//            System.out.println("CHILD " + i + ": " + ctx.getChild(i).getText());
//        }

		
//		System.out.println("THIS IS: " + ctx.getText());
		if(ctx.getChildCount() == 1) {
//			System.out.println("THE VALUE OF THE CONTEXT IS " + ctx.getText());
            if(ctx.getText().equals("true")){
                return 1;
            }else if(ctx.getText().equals("false")){
                return 0;
            }else{
            	if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, ctx.getChild(0).getText())) {
    				return Integer.parseInt(ctx.getChild(0).getText());
    			}else {
    				try {
    					return Integer.parseInt(VariableManager.searchVariable(ctx.getText(), constructVariableScope(ctx)).getValue().getValue().toString());
    				} catch (VariableNotFoundError e) {
    					e.printStackTrace();
    				}			
    				return -1;
    			}
            }
		}else {
			int sample = BooleanUtil.solve(visitBoolean_expression(ctx.left), ctx.op.getText(), visitBoolean_expression(ctx.right)) ? 1 : 0;
			return sample;
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
		}
//		
	}
	
	
	@Override
	public Integer visitVariableDeclarator(VariableDeclaratorContext ctx) {
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
	public Integer visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
//		System.out.println("here at variable id");
		
		
//	
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableDeclaratorId(ctx);
	}
	
	@Override
	public Integer visitDataType(DataTypeContext ctx) {
//		System.out.println("here at variable datatype");
//		tempType = ctx.getChild(0).getText();
//		
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitDataType(ctx);
	}
	
	@Override
	public Integer visitMethodDeclaration(MethodDeclarationContext ctx) {
		return super.visitMethodDeclaration(ctx);
	}
	
	@Override
	public Integer visitMath_expression(Math_expressionContext ctx) {
//		System.out.println("CHILDCOUNT: " + ctx.getChildCount());
//		for(int i = 0; i < ctx.getChildCount(); i++) {
//			System.out.println("CHILD " + i + ": " + ctx.getChild(i).getText());
//		}
		
		if(ctx.getChildCount() == 1){
			if(Pattern.matches(PatternDictionary.INTEGER_PATTERN, ctx.getChild(0).getText())) {
				return Integer.parseInt(ctx.getChild(0).getText());
			}else {
				try {
					return Integer.parseInt(VariableManager.searchVariable(ctx.getText(), constructVariableScope(ctx)).getValue().getValue().toString());
				} catch (VariableNotFoundError e) {
					e.printStackTrace();
				}			
				return -1;
			}
		}
		else {
			return (Integer) MathUtil.solve(visitMath_expression(ctx.left), ctx.op.getText().charAt(0), visitMath_expression(ctx.right));
		}
	}
	
	@Override
	public Integer visitExpression(ExpressionContext ctx) {
		
		
//		System.out.println();
//		System.out.println("EXPRESSION START");
//		System.out.println();
		
		int total = ctx.getChildCount();
		for(int i = 0; i < total; i++) {
			
			switch(ctx.getChild(i).getText()) {
				case FunctionDictionary.FUNCTION_PRINT:
//					System.out.println("PRINTING HERE");
					if(i+2 < ctx.getChildCount()) {
						//System.out.println("ADDING " + ctx.getChild(i+2).getText());
						OutputCollector.getInstance().append((StringUtil.constructStringFromPrintStatement(ctx.getChild(i+2).getText())));	
					}
					break;
                case FunctionDictionary.FUNCTION_SCAN:
//                	System.out.println("SCANNING");
                	PopUpGUI p = new PopUpGUI();
            		
//            		System.out.println("showed ui");
//            		System.out.println("heree" + p.getInput());
            		
            		boolean temp = true;
            		while(temp){
            			if(!p.getInput().equals("")){
            				temp = false;
            				//get input here
//            				System.out.println("heree" + p.getInput());
            			}
            		}
                	if(i + 2 < ctx.getChildCount() && ctx.getChild(i+2).getClass().getSimpleName().equals(ExpressionListContext.class.getSimpleName())){
//                		System.out.println("HERE");
                		String varScope = constructVariableScope(ctx);
                		String varName = varScope + "$" + ctx.getChild(i+2).getChild(0).getText();
//                		System.out.println("SCAN SAYS: Scope of given variable is at " + varScope);
//                		System.out.println("SCAN SAYS: Entering value entered at variable " + varName);
                		
                		
//                		InputCollector.getInstance().store(, ctx.getChild(i+2).getChild(2).getText());
                	}
                    break;
//                case FunctionDictionary.FUNCTION_FOR_LOOP:
//                	System.out.println();
//                	for(int j=0; j<ctx.getChildCount() ;j++)
//                		System.out.println(j + " : " + ctx.getChild(j));
//                		
//                	break;
                default: 
//                	System.out.println("DEFAULT " + i + " : " + ctx.getChild(i).getText() + " \t|\t " + ctx.getChild(i).getClass().getSimpleName()); 
			}
		}
		
//		System.out.println();
//		System.out.println("EXPRESSION END");
//		System.out.println();
		// TODO Auto-generated method stub
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
}