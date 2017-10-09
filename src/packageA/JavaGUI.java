package packageA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

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
		setTitle("COMPILER v0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 735);
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
		taField.getDocument().addDocumentListener(new DocumentListener(){
			public String getText(){
				int caretPosition = taField.getDocument().getLength();
				Element root = taField.getDocument().getDefaultRootElement();
				String text = " 1  " + System.getProperty("line.separator");
				for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
					text += " " + i + "  " + System.getProperty("line.separator");
				}
				return text;
			}
			@Override
			public void changedUpdate(DocumentEvent de) {
				taLineNumber.setText(getText());
			}
 
			@Override
			public void insertUpdate(DocumentEvent de) {
				taLineNumber.setText(getText());
			}
 
			@Override
			public void removeUpdate(DocumentEvent de) {
				taLineNumber.setText(getText());
			}
 
		});
		
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
