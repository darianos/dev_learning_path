import javax.swing.*;

public class P23 extends JFrame{

	private JLabel L1;
	private JLabel L2;
	
	
	public P23 (){
	
		setLayout(null);
		L1 = new JLabel("Interfaz Gráfica.");
		L1.setBounds(10,20,300,30);
		add(L1);
		L2 = new JLabel("Hola Mundo!");
		L2.setBounds(10,100,300,30);
		add(L2);
	}

	public static void main(String args[]){
		
		P23 LabelScreen = new P23();
		LabelScreen.setBounds(0,0,300,200);
		LabelScreen.setResizable(false);
		LabelScreen.setVisible(true);
		LabelScreen.setLocationRelativeTo(null);	
	}

}