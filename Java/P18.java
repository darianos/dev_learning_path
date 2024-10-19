import java.util.Scanner;

public class P18{
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int s = 0;
		
		System.out.println("Por favor ingresa el tamaño del arreglo:");
		System.out.print("->");
		
		s = in.nextInt();
		
		int num[] = new int[s];
		
		System.out.println("ingresa los números por favor:"); 
			
		for (int i = 0; i < num.length; i++){
			
			System.out.print("->");

			num[i] = in.nextInt();

			System.out.println("");
		}

		System.out.println("El arreglo es:");		

		for (int j = 0; j < num.length; j++){
			
			
			System.out.print("[" + num[j] + "]");
		}	
	}
}