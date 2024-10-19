import javax.swing.*;
import java.awt.event.*;

public class P24 extends JFrame implements ActionListener{
	
	JButton B1;

	public P24(){
		
		setLayout(null);
		B1 = new JButton("Cerrar");
		B1.setBounds (300,250,100,30);
		add(B1);
		B1.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent E1){

		if(E1.getSource() == B1){
			
			System.exit(0);
		}		
	}
	
	public static void main(String args[]){
		
		P24 Screen = new P24();
		Screen.setBounds(0,0,500,400);
		Screen.setVisible(true);
		Screen.setResizable(false);
		Screen.setLocationRelativeTo(null);
	}	
}