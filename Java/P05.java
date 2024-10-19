//Ha de escogerse el numero y cambiar la variable 'in' desde el código para escoger la operación siendo:
// 1 = Suma.
// 2 = Resta.
// 3 = Multiplicación.
// 4 = División.

public class P05{
	
	public static void main (String args[]){

		
		int n1 = 3;
		int n2 = 4;
		int n3 = 0;
		int in = 3;
		
		if(in == 1){
			System.out.println("Has elegido suma.");
			n3 = n1 + n2;
			System.out.println("El valor de la suma es:" + n3 );
		}else if(in == 2){
			System.out.println("Has elegido resta.");
			n3 = n1 - n2;
			System.out.println("El valor de la resta es:" + n3);
		}else if (in == 3){
			System.out.println("Has elegido multiplicación.");
			n3 = n1 * n2;
			System.out.println("El resultado de la multiplicación es:" + n3);
		}else if(in == 4){
			System.out.println("Has elegido division.");
			n3= n1 / n2;
			System.out.println("El valor de la división es:" + n3);
		}else{
			System.out.println("La opción elegida no existe.");
		}
	}
}

