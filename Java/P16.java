import java.util.Scanner;

public class P16{
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String p1 = "", p2 = "";	
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Bienvenido, por favor ingrese su cadena de caracteres.");
		System.out.print("->");
		
		p1 = in.nextLine();
		n1 = p1.length();
		
		System.out.println("La cadena tiene " + n1 + " caracteres.");
		System.out.println("");
		System.out.println("Indique la posicion de caracter inicial para extraer de la cadena:");
		System.out.print("->");
		n2 = in.nextInt();
		System.out.println("");
		System.out.println("Indique la posición de caracter final para extraer de la cadena:");			
		System.out.print("->");
		n3 = in.nextInt();
		p2 = p1.substring(n2,n3);
		System.out.println("");
		System.out.println("La cadena extraida es:" + p2);
		
		
	}
}