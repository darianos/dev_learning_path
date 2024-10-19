import java.util.Scanner;

public class P20{
	
	public static void main (String args[]){
		
		Scanner in = new Scanner(System.in);

		System.out.println("Bienvenido. Ingresa el tamaño de la matriz por favor:");
		System.out.print("H ->");
		int h = in.nextInt();

		System.out.println("");
		System.out.print("V ->");
		int v = in.nextInt();

		int num[][] = new int[h][v];

		int c = 1;

		for(int i = 0; i < h; i++){
			
			for(int j = 0; j < v; j++){
				
				num[i][j] = c;
				c++;
			}
		}

		System.out.println("La matríz obtenida es:");
		for(int i = 0; i < h; i++){
			System.out.print("     ");
			for(int j = 0; j < v; j++){
				
				System.out.print("[" + num[i][j] + "]");

				
			}
			System.out.println("");
		}

	}
}