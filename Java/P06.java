import java.util.Scanner;

public class P06{
	
	public static void main (String args[]){
		
		Scanner in = new Scanner(System.in);
		String name = "";
		int n1, n2, n3;
		
		System.out.println("Ingrese su nombre:");
		name = in.nextLine();
		System.out.println("Bienvenido " + name + ". Por favor ingrese los valores para la suma.");
		System.out.println("Ingrese el primer número 1: ");
		n1 = in.nextInt();
		System.out.println("Ahora ingrese por favor el número 2: ");
		n2 = in.nextInt();
		n3 = n1 + n2;
		System.out.println("De acuerdo, "+ name + ", el resultado de la suma es:" + n3);
	}
}