import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;






public class Calculator implements ActionListener{
	
	int Distinguish=0;
	
	
	String oldValue;
	boolean OperatorClicked=false;
	JFrame jf;
	JLabel DisplayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalsButton;
	JButton divideButton;
	JButton mulButton;
	JButton minusButton;
	JButton addButton,clearButton;
	
	
	
	
	
	public Calculator() {
		
		jf=new JFrame("Sandy's Calculator");
		jf.setLayout(null);
		jf.setSize(660, 620);
		jf.setLocation(400, 100);
		
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(30, 10, 580, 70);
		DisplayLabel.setBackground(Color.WHITE);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.DARK_GRAY);
		DisplayLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 40));
		DisplayLabel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5));
		jf.add(DisplayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 100, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(140, 100, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(250, 100, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 220, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(140, 220, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(250, 220, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 340, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(140, 340, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(250, 340, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 460, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(140, 460, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalsButton=new JButton("=");
		equalsButton.setBounds(250, 460, 120, 80);
		equalsButton.setFont(new Font("Arial", Font.PLAIN, 40));
		equalsButton.addActionListener(this);
		jf.add(equalsButton);
		
		divideButton=new JButton("/");
		divideButton.setBounds(510, 100, 100, 100);
		divideButton.setFont(new Font("Arial", Font.PLAIN, 40));
		divideButton.addActionListener(this);
		jf.add(divideButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(510, 220, 100, 100);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(390, 100, 100, 100);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		addButton=new JButton("+");
		addButton.setBounds(390, 220, 100, 200);
		addButton.setFont(new Font("Arial", Font.PLAIN, 40));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(510, 440, 100, 100);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("7");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
			
		}
		else if(e.getSource()==eightButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("8");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==nineButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("9");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
			
		}else if(e.getSource()==fourButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("4");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"4");
			}
			
		}else if(e.getSource()==fiveButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("5");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("6");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"6");
			}
		}else if(e.getSource()==oneButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("1");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"1");
			}
		}else if(e.getSource()==twoButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("2");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("3");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"3");
			}
		}else if(e.getSource()==dotButton) {
			if(OperatorClicked) {
				DisplayLabel.setText(".");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+".");
			}
		}else if(e.getSource()==zeroButton) {
			if(OperatorClicked) {
				DisplayLabel.setText("0");
				OperatorClicked=false;
				
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"0");
			}
			
		}else if (e.getSource()==equalsButton) {
			
            String newValue=DisplayLabel.getText();
			
			Float newValueF=Float.parseFloat(newValue);
			Float oldValueF=Float.parseFloat(oldValue);
			
			if(Distinguish==1) {
				Float Result=oldValueF+newValueF;
				
				DisplayLabel.setText(Result+"");
			
			}else if (Distinguish==2) {
				Float Result=oldValueF-newValueF;
				
				DisplayLabel.setText(Result+"");
				
			}else if (Distinguish==3) {
				Float Result=oldValueF*newValueF;
				
				DisplayLabel.setText(Result+"");

			}else if (Distinguish==4) {
				Float Result=oldValueF/newValueF;
				
				DisplayLabel.setText(Result+"");
			
			} 
		}else if(e.getSource()==clearButton) {
			DisplayLabel.setText("");
			
		}else if (e.getSource()==addButton) {
			OperatorClicked=true;
			Distinguish=1;
			oldValue=DisplayLabel.getText();
			
		
		}else if (e.getSource()==minusButton) {
			OperatorClicked=true;
			Distinguish=2;
			oldValue=DisplayLabel.getText();
			
			
		}else if (e.getSource()==mulButton) {
			OperatorClicked=true;
			Distinguish=3;
			oldValue=DisplayLabel.getText();
			

        }else if (e.getSource()==divideButton) {
        	OperatorClicked=true;
			Distinguish=4;
			oldValue=DisplayLabel.getText();
			
        }
		
	}
}
			
		
	
	
			
        
			
