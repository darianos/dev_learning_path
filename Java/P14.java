import java.util.Scanner;

public class P14{
	
	public static void main(String args[]){
		
		Scanner in =  new Scanner(System.in);
		
		String name1 = "", name2 = "";
		
		System.out.println("Bienvenido al comparador de cadenas de texto.");
		System.out.println("");
		System.out.println("Por favor ingrese dos nombres para compararlos");
		System.out.print("Nombre 1 ->");
		name1 = in.nextLine();
		System.out.println("");
		System.out.print("Nombre 2 ->");
		name2 = in.nextLine();
		System.out.println("");

		if(name1.equalsIgnoreCase(name2)){
			System.out.println("Los nombres son iguales.");
		}else{
			System.out.println("Los nombres son diferentes.");
		}
	}
}