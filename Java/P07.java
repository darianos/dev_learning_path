import java.util.Scanner;

public class P07{
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String name;
		int n1 = 0, n2 = 0, n3 = 0; 

		System.out.println("");
		System.out.println("");
		System.out.println("                            ********************");
		System.out.println("                            ********************");
		System.out.println("                            **CocaCola Company**");
		System.out.println("                            ********************");
		System.out.println("                            ********************");
		System.out.println("");
		System.out.println("");
		System.out.println("Hola, ingresa tu nombre: ");
		System.out.print("->");
		name =  in.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("Bienvenido " + name + " al sistema de calculo vacacional");
		System.out.println("");

		System.out.println("Por favor indicanos cuantos años llevas trabajando en la empresa.");
		System.out.print("->");
		n2 = in.nextInt();
		System.out.println("");
		System.out.println("");
		if (n2 < 1){
			System.out.println("Lo sentimos, aún no cumples con el tiempo mínimo requerido para obtener vacaciones.");
			System.out.println("¡No te rindas!");
			System.out.println("");
			System.out.println("");
		}else{	
			System.out.println("¡Genial! Ahora ingresa la clave de tu departamento, por favor");
			System.out.println("");
			System.out.println("Atención al cliente. ---- Clave -> 1.");
			System.out.println("Logística. -------------- Clave -> 2.");
			System.out.println("Gerencia. --------------- Clave -> 3.");
			System.out.println("");
			System.out.print("Ingresa la Clave ->");
			n1 = in.nextInt();
			System.out.println("");
			System.out.println("");
			if(n1 != 1 && n1 != 2 && n1 != 3){
				System.out.println("Lo sentimos, " + name + ", la opción que ingresaste no es valida. Intenta nuevamente.");
			}else{
				if(n1 == 1){
					if(n2 == 1){
						n3 = 6;
					}else if(n2 > 2 && n2 < 6){
						n3 = 14;
					}else if(n2 >= 7){
						n3 = 20;
					}
				} else if(n1 == 2){
					if(n2 == 1){
						n3 = 7;
					}else if(n2 > 2 && n2 < 6){
						n3 = 15;
					}else if(n2 >= 7){
						n3 = 22;
					}
				}else if(n1 == 3){
					if(n2 == 1){
						n3 = 10;
					}else if(n2 > 2 && n2 < 6){
						n3 = 20;
					}else if(n2 >= 7){
						n3 = 30;
					}
				}	
				System.out.println("¡Super, "+ name + "! Tienes derecho a " + n3 + " días de vacaciones.");	
				System.out.println("");
			}	
		}
		
		System.out.println("¡Gracias por utilizar el sistema de calculo vacacional, te esperamos pronto!");
		System.out.println("");
		System.out.println("");	
		System.out.println("                            ********************");
		System.out.println("                            ********************");
		System.out.println("                            **CocaCola Company**");
		System.out.println("                            ********************");
		System.out.println("                            ********************");
		System.out.println("");
		System.out.println("");
	}
}