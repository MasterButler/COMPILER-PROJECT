package packageA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.gui.TreeViewer.DefaultTreeTextProvider;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.Tree;
import packageA.gui.LineNumberModel;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaGUI extends JFrame implements MouseListener{

	private JPanel contentPane;

	private JScrollPane scrollPane;
	private JTextArea taField;
	private JTextArea taLineNumber;
	private JButton btnRun; 
	
	private JScrollPane spLexer;
	private JTextArea taLexer;
	private JScrollPane spResult;
	private JTextArea taResult;
	private JTextField tfStatus;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaGUI frame = new JavaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JavaGUI() {
		initializeUI();
		initializeListeners();

		updateStatus(1,0);
	}
	
	public void initializeUI() {
		setResizable(false);
		setTitle("COMPILER v0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 100, 701, 741);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setRowHeaderView(taLineNumber);
		scrollPane.setBounds(10, 45, 678, 414);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(taField);
		
		taLineNumber = new JTextArea();  
		taLineNumber.setFont(new Font("Consolas", Font.PLAIN, 13));
		taLineNumber.setBackground(Color.LIGHT_GRAY);
		taLineNumber.setText(" 1  " + System.getProperty("line.separator"));
 		taLineNumber.setEditable(false);
 				
 		taField = new JTextArea();       
		taField.setFont(new Font("Consolas", Font.PLAIN, 13));

		scrollPane.setViewportView(taField);
		scrollPane.setRowHeaderView(taLineNumber);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		btnRun = new JButton("\t\u25B6");
		btnRun.setBounds(10, 11, 54, 23);
		btnRun.addMouseListener(this);
		contentPane.add(btnRun);
		
		spLexer = new JScrollPane();
		spLexer.setBounds(698, 11, 254, 674);
		contentPane.add(spLexer);
		
		taLexer = new JTextArea();
		taLexer.setForeground(Color.RED);
		taLexer.setFont(new Font("Consolas", Font.PLAIN, 13));
		taLexer.setEditable(false);
		taLexer.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		taLexer.setVisible(false);
		spLexer.setViewportView(taLexer);
		
		spResult = new JScrollPane();
		spResult.setBounds(10, 470, 678, 215);
		contentPane.add(spResult);
		
		taResult = new JTextArea();
		taResult.setLineWrap(true);
		taResult.setEditable(false);
		spResult.setViewportView(taResult);
		
		tfStatus = new JTextField();
		tfStatus.setForeground(Color.WHITE);
		tfStatus.setBackground(Color.DARK_GRAY);
		tfStatus.setBounds(10, 690, 678, 20);
		contentPane.add(tfStatus);
		tfStatus.setColumns(10);
		
	}
	
	public void initializeListeners() {
		taField.getDocument().addDocumentListener(new DocumentListener(){
			public String getText(){
				return updateLineNumbers();
			}
			@Override
			public void changedUpdate(DocumentEvent de) {
				taLineNumber.setText(getText());
				scrollPane.revalidate();
				scrollPane.repaint();

			}
 
			@Override
			public void insertUpdate(DocumentEvent de) {
				taLineNumber.setText(getText());
				scrollPane.revalidate();
				scrollPane.repaint();				
			}
 
			@Override
			public void removeUpdate(DocumentEvent de) {
				taLineNumber.setText(getText());
				scrollPane.revalidate();
				scrollPane.repaint();
			}
		});
		taField.addCaretListener(new CaretListener() {
            // Each time the caret is moved, it will trigger the listener and its method caretUpdate.
            // It will then pass the event to the update method including the source of the event (which is our textarea control)
			@Override
            public void caretUpdate(CaretEvent e) {
                JTextArea editArea = (JTextArea)e.getSource();

                // Lets start with some default values for the line and column.
                int linenum = 1;
                int columnnum = 1;

                // We create a try catch to catch any exceptions. We will simply ignore such an error for our demonstration.
                try {
                    // First we find the position of the caret. This is the number of where the caret is in relation to the start of the JTextArea
                    // in the upper left corner. We use this position to find offset values (eg what line we are on for the given position as well as
                    // what position that line starts on.
                    int caretpos = editArea.getCaretPosition();
                    linenum = editArea.getLineOfOffset(caretpos);

                    // We subtract the offset of where our line starts from the overall caret position.
                    // So lets say that we are on line 5 and that line starts at caret position 100, if our caret position is currently 106
                    // we know that we must be on column 6 of line 5.
                    columnnum = caretpos - editArea.getLineStartOffset(linenum);

                    // We have to add one here because line numbers start at 0 for getLineOfOffset and we want it to start at 1 for display.
                    linenum += 1;
                }
                catch(Exception ex) { }

                // Once we know the position of the line and the column, pass it to a helper function for updating the status bar.
                updateStatus(linenum, columnnum);
            }

        });
		
//		taField.scroll
		taField.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {
				int caret = taField.getCaretPosition();
				scrollPane.validate();
				scrollPane.repaint();
				
			}
		});
		
		scrollPane.getRowHeader().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
			    JViewport viewport = (JViewport) e.getSource();
			    scrollPane.getVerticalScrollBar().setValue(viewport.getViewPosition().y);
			}
		} );
	}
	
    private void updateStatus(int linenumber, int columnnumber) {
        tfStatus.setText("Line: " + linenumber + " Column: " + columnnumber);
    }
	
	public String updateLineNumbers(){
		int caretPosition = taField.getDocument().getLength();
		Element root = taField.getDocument().getDefaultRootElement();
		StringBuilder text = new StringBuilder();
		text.append(" 1  ").append(System.getProperty("line.separator"));
		for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
			text.append(" ").append(i).append("  ").append(System.getProperty("line.separator"));
		}
		return " " + text.toString().trim() + "  ";
	}
    
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource().equals(btnRun)) {
			MyVisitor mv = new MyVisitor();
			System.out.println("Input is: ");
			System.out.println(taField.getText().toString());
			String output = mv.visit(taField.getText().toString());
			
			TreeViewer viewr = new TreeViewer(Arrays.asList(
	                mv.getParser().getRuleNames()), mv.getTree());
			viewr.setScale(1.5);
		    viewr.open();
		    
//			JavaLexer lexer = new JavaLexer(CharStreams.fromString(taField.getText().toString()));	        
//	        CommonTokenStream tokens = new CommonTokenStream(lexer);
//	        JavaBaseErrorListener javaErrorListener = new JavaBaseErrorListener();
//	        SyntaxErrorCollector.getInstance().reset();
//	        ANTLRErrorStrategy defaultStrat = new DefaultErrorStrategy();
//	        JavaParser parser = new JavaParser(tokens);
//	        
//	        org.antlr.v4.runtime.tree.ParseTree tree = parser.code();
//	        
//			TreeViewer tv = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
//
//			tv.setVisible(true);
//			pane.setViewportView(tv);
//			tv.setBounds(698, 11, 254, 674);
//			tv.setVisible(true);
//			contentPane.add(tv);
//			tv.setTreeTextProvider(new TreeTextProvider()
//	        {
//	            TreeTextProvider defaultProvider = new DefaultTreeTextProvider(Arrays.asList(parser.getRuleNames()));
//
//	            @Override
//	            public String getText(Tree node)
//	            {
//	                if (node instanceof ParseTree) {
//	                    NodeState nodeState = states.get((ParseTree)node);
//
//	                    ExpressionValue value;
//	                    if (nodeState != null) {
//	                        value = nodeState.getExpressionValue();
//	                    }else{
//	                        value = null;
//	                    }
//
//	                    if (value != null) {
//	                        return defaultProvider.getText(node) + "(" + value + ")";
//	                    }else{
//	                        return defaultProvider.getText(node) + "(null)";
//	                    }
//	                }
//
//	                return defaultProvider.getText(node);
//	            }
//	        });
//	        tv.open();
//
//			
//			StringBuilder sb = new StringBuilder();
//			Token curr = lexer.getToken();
//	        sb.append(curr.getText())
//	    	.append(" | ")
//	    	.append(JavaLexer.VOCABULARY.getSymbolicName(curr.getType()))
//	    	.append(System.getProperty("line.separator"));
//	        
//	        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
//	        	System.out.println("COUNT");
//	            sb.append(token.getText())
//	            	.append(" | ")
//	            	.append(JavaLexer.VOCABULARY.getSymbolicName(token.getType()))
//	            	.append(System.getProperty("line.separator"));
//	        }
//	        
//	        MyVisitor visitor = new MyVisitor(); 
//	        visitor.visit(tree);
	        	
	        
			
			taLexer.setText(output);
			
			if(SyntaxErrorCollector.getInstance().countErrors() == 0) {
				taResult.setText("Code successfully compiled");							
			}else {
				taResult.setText(SyntaxErrorCollector.getInstance().listErrors());			
			}
		}
	}
}
