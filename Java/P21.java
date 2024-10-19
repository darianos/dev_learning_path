import javax.swing.*;

public class P21 extends JFrame{
	
	private JLabel tag1;
	
	public P21(){
	
		setLayout(null);
		tag1 = new JLabel("Curso Java: David Alejandro Riaño Sarmiento");
		tag1.setBounds(10,20,400,300);
		add(tag1);	
		
	}
	
	public static void main(String args[]){
		
		P21 screentag = new P21();
		screentag.setBounds(0,0,500,500);
		screentag.setVisible(true);
		screentag.setLocationRelativeTo(null);
	}
}