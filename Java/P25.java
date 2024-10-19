import javax.swing.*;
import java.awt.event.*;

public class P25 extends JFrame implements ActionListener{
	
	private JButton B1, B2, B3;
	private JLabel L1;	

	P25(){
		setLayout(null);
		B1= new JButton("1");
		B1.setBounds(10,100,90,30);
		add(B1);
		B1.addActionListener(this);
		
		B2= new JButton("2");
		B2.setBounds(120,100,90,30);
		add(B2);
		B2.addActionListener(this);
		
		B3= new JButton("3");
		B3.setBounds(230,100,90,30);
		add(B3);
		B3.addActionListener(this);
		
		L1 = new JLabel("En espera...");
		L1.setBounds(30,30,400,40);
		add(L1);
	}
	
	public void actionPerformed(ActionEvent E){
		
		if(E.getSource() == B1){
			
			L1.setText("Has presionado el Boton 1");	
			
		}else if(E.getSource() == B2){
		
			L1.setText("Has presionado el Boton 2");
		
		}else if(E.getSource() ==B3){
			
			L1.setText("Has presionado el Boton 3");
		}
	}

	public static void main(String args[]){
		
		P25 app = new P25();
		app.setBounds(0,0,600,300);
		app.setResizable(false);
		app.setVisible(true);
		app.setLocationRelativeTo(null);
	}
}