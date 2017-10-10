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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;

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
		setBounds(100, 100, 978, 741);
		contentPane = new JPanel();
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
		btnRun.setBounds(10, 11, 89, 23);
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
		spLexer.setViewportView(taLexer);
		
		spResult = new JScrollPane();
		spResult.setBounds(10, 470, 678, 215);
		contentPane.add(spResult);
		
		taResult = new JTextArea();
		taResult.setEditable(false);
		spResult.setViewportView(taResult);
		
		tfStatus = new JTextField();
		tfStatus.setBackground(SystemColor.menu);
		tfStatus.setBounds(10, 690, 942, 20);
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
			taLexer.setText(output);
		}
	}
}
