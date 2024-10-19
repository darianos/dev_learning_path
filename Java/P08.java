import java.util.Scanner;

public class P08{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		String op = "";
		int n1 = 5, n2 = 3, n3 = 0, n4 = 0;
		
		System.out.println("");
		System.out.println("");
		System.out.println(" ¡Hola! Por favor elige una operacion para los numeros 5 y 3.");
		System.out.println("");
		System.out.println("Suma -----------------> 1");
		System.out.println("Resta ----------------> 2");
		System.out.println("Multiplicacion -------> 3");
		System.out.println("Division -------------> 4");
		System.out.println("");
		System.out.print("->");
		n4 = in.nextInt();
		
		switch(n4){
			case 1:
				n3 = n1 + n2;
				op = "suma";
			break;
			case 2:
				n3 = n1 - n2;
				op = "resta";
			break;
			case 3:
				n3 = n1 * n2;
				op = "multiplicacion";
			break;
			case 4:
				n3 = n1 / n2;
				op = "division";
			break;
			default:
				System.out.println("Error. La opcion elegida no existe.");
			break;
		}
		System.out.println("El resultado de la " + op + " es: "+ n3);		
	}
}