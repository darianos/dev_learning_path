import javax.swing.*;
import java.awt.event.*;

public class P26 extends JFrame implements ActionListener{
	
	private JTextField T1;
	private JButton B1;
	private JLabel L1;

	public P26(){
		
		setLayout(null);
		
		L1 = new JLabel("Titulo:");
		L1.setBounds(10,10,100,40);
		add(L1);
		
		T1 = new JTextField();
		T1.setBounds(110,10,200,40);
		add(T1);
		
		B1 = new JButton("Aceptar");
		B1.setBounds(30,50,100,40);
		add(B1);
		B1.addActionListener(this);
		
		}	
	
	public void actionPerformed(ActionEvent E){
		
		if(E.getSource() == B1){
			
			String C = T1.getText();
			setTitle(C);
		}				
	}
	
	public static void main(String args []){
		
		P26 T = new P26();
		T.setBounds(0,0,500,200);
		T.setLocationRelativeTo(null);
		T.setVisible(true);
		T.setResizable(false);
	}
}