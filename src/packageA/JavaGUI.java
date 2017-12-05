package packageA;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;

import org.antlr.v4.gui.TreeViewer;

import packageA.collector.InputCollector;
import packageA.collector.OutputCollector;
import packageA.collector.StandardInputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.storage.Storage;
import packageA.variable.Variable;
import packageA.variable.util.VariableManager;
import javax.swing.JLabel;

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
	
	private JTextArea taInputField;
	
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
		scrollPane.setBounds(10, 62, 471, 397);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(taField);
		
		taLineNumber = new JTextArea();  
		taLineNumber.setFont(new Font("Consolas", Font.PLAIN, 13));
		taLineNumber.setBackground(Color.LIGHT_GRAY);
		taLineNumber.setText(" 1  " + System.getProperty("line.separator"));
 		taLineNumber.setEditable(false);
 				
 		taField = new JTextArea();       
 		taField.setTabSize(2);
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
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setForeground(Color.WHITE);
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCode.setBounds(10, 45, 100, 15);
		contentPane.add(lblCode);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(491, 62, 194, 397);
		scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		contentPane.add(scrollPane_1);
		
		taInputField = new JTextArea();
		scrollPane_1.setViewportView(taInputField);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setForeground(Color.WHITE);
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInput.setBounds(491, 45, 100, 15);
		contentPane.add(lblInput);
		
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
			resetSingleton();
			
			taResult.setText("");
			StandardInputCollector.getInstance().recordInput(getUserInput());
			
			MyVisitor mv = new MyVisitor();
			System.out.println("Input is: \n");
			System.out.println(taField.getText().toString());
			String output = mv.visit(taField.getText().toString());
			taLexer.setText(output);
			
			
//			VariableManager.addVariable(new Variable("String", "adsads"));
//			VariableManager.addVariable(new Variable("String", "adsads"));
			
			
			TreeViewer viewr = new TreeViewer(Arrays.asList(
	                mv.getParser().getRuleNames()), mv.getTree());
			viewr.setScale(1.5);
		    viewr.open();
			
			
			if(SyntaxErrorCollector.getInstance().countErrors() == 0) {
				taResult.setText(OutputCollector.getInstance().getOutput());				
			}else {
				taResult.setText(SyntaxErrorCollector.getInstance().listErrors());			
			}
			
//			System.out.println("==========");
//			System.out.println(StandardInputCollector.getInstance().getNextLine());
//			System.out.println(StandardInputCollector.getInstance().getNext());
		}
	}
	
	public void resetSingleton() {
		OutputCollector.getInstance().reset();
		Storage.getInstance().reset();
		InputCollector.getInstance().reset();
		StandardInputCollector.getInstance().reset();
		SyntaxErrorCollector.getInstance().reset();
		
	}
	
	public ArrayList<ArrayList<String>> getUserInput(){
		ArrayList<ArrayList<String>> input = new ArrayList<ArrayList<String>>();
		
		String[] raw = taInputField.getText().split("\n");
		for(int i = 0; i < raw.length; i++) {
			ArrayList<String> preCut = new ArrayList<>(Arrays.asList(raw[i].split(" "))); 
			input.add(preCut);
		}
		
		for(int i = 0; i < input.size(); i++) {
			for(int j = 0; j < input.get(i).size(); j++) {
				System.out.print(input.get(i).get(j));
			}
			System.out.println();
		}
		
		return input;
	}
}
