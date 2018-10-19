package calculator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator_1 {

	private JFrame frame;
	private JTextField dis;
	static double a=0,b=0;
	static double ans=0;
	static int op=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_1 window = new calculator_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("7"));
			}
		});
		seven.setBounds(10, 80, 89, 23);
		frame.getContentPane().add(seven);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("4"));
			}
		});
		four.setBounds(10, 114, 89, 23);
		frame.getContentPane().add(four);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
			dis.setText(dis.getText().concat("1"));
				
			}
		});
		one.setBounds(10, 148, 89, 23);
		frame.getContentPane().add(one);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("8"));
			}
		});
		eight.setBounds(109, 80, 89, 23);
		frame.getContentPane().add(eight);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("5"));
			}
		});
		five.setBounds(109, 114, 89, 23);
		frame.getContentPane().add(five);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("2"));
			}
		});
		two.setBounds(109, 148, 89, 23);
		frame.getContentPane().add(two);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("9"));
			}
		});
		nine.setBounds(208, 80, 89, 23);
		frame.getContentPane().add(nine);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("6"));
			}
		});
		six.setBounds(208, 114, 89, 23);
		frame.getContentPane().add(six);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("3"));
			}
		});
		three.setBounds(208, 148, 89, 23);
		frame.getContentPane().add(three);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("0"));
			}
		});
		zero.setBounds(10, 182, 89, 23);
		frame.getContentPane().add(zero);
		
		JButton eq = new JButton("=");
		eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b=Double.parseDouble(dis.getText());
				switch(op){
				case 1: ans=a+b;
				break;
				case 2: ans=a-b;
				break;
				case 3: ans=a*b;
				break;
				case 4: ans=a/b;
				break;
				default: ans=0;
				}
				dis.setText(""+ans);
			}
		});
		eq.setBounds(208, 182, 89, 23);
		frame.getContentPane().add(eq);
		
		JButton dec = new JButton(".");
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText(dis.getText().concat("."));
			}
		});
		dec.setBounds(109, 182, 89, 23);
		frame.getContentPane().add(dec);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Double.parseDouble(dis.getText());
				op=1;
				dis.setText("");
			}
		});
		add.setBounds(372, 80, 52, 91);
		frame.getContentPane().add(add);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Double.parseDouble(dis.getText());
				op=4;
				dis.setText("");
			}
		});
		div.setBounds(372, 182, 52, 23);
		frame.getContentPane().add(div);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Double.parseDouble(dis.getText());
				op=3;
				dis.setText("");
			}
		});
		mul.setBounds(307, 114, 55, 57);
		frame.getContentPane().add(mul);
		
		JButton sub = new JButton("__");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Double.parseDouble(dis.getText());
				op=2;
				dis.setText("");
			}
		});
		sub.setBounds(310, 182, 52, 23);
		frame.getContentPane().add(sub);
		
		dis = new JTextField();
		dis.setBounds(10, 11, 414, 58);
		frame.getContentPane().add(dis);
		dis.setColumns(10);
		
		JButton clr = new JButton("AC");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dis.setText("");
			}
		});
		clr.setBounds(307, 80, 55, 23);
		frame.getContentPane().add(clr);
	}
}
