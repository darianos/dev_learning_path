import java.util.Scanner;

public class P15{
	
	public static void main (String args[]){
		
		Scanner in = new Scanner(System.in);
		int op1 = 0, op2 = 0;
		String user = "darianos", pw = "Admin", e_user = "", e_pw = "", e_cpw = "", name = "David";
		
		while(op1!=3){
			System.out.println("");
			System.out.println("Bienvenido.");
			System.out.println("");
			System.out.println("Escoja la opción según corresponda:");
			System.out.println("");
			System.out.println("Ingresar -------> 1.");
			System.out.println("Registrarse ----> 2.");
			System.out.println("Salir ----------> 3.");
			System.out.println("");
			System.out.print("->");
			op1 = in.nextInt();
			System.out.println("");
			switch(op1){
				case 1:
					for(int j = 0; j<=3;j++){
						System.out.println("Por favor ingrese su usuario:");
						System.out.print("->");
						e_user = in.nextLine();
						System.out.println("Por favor ingrese la contraseña:");
						System.out.print("->");
						e_pw = in.nextLine();
						if(e_user.equalsIgnoreCase(user) && e_pw.equals(pw)){
							System.out.println("Bienvenido, " + name + "¿Que operacion desea realizar?:");
							System.out.println("");
							System.out.println("Cambiar nombre ---------> 1.");
							System.out.println("Cambiar contraseña -----> 2.");
							System.out.println("Cerrar sesion ----------> 3.");
							System.out.println("");
							System.out.print("->");
							op2 = in.nextInt();
							System.out.println("");
							switch(op2){
								case 1:
									for(int i = 0; i<=3; i++){
										System.out.println("De acuerdo, ingresa tu nuevo nombre por favor.");
										System.out.print("->");
										name = in.nextLine();
										System.out.println("\n Confirma el proceso ingresando tu contraseña:");
										System.out.print("->");
										e_pw = in.nextLine();
										System.out.println("");
										if(e_pw.equals(pw)){
											System.out.println("El cambio de nombre se ha realizado con éxito.");
											i = 10;
										}else{
											if(i == 3){
												System.out.println("Demasiados intentos. \n\n Cancelando proceso. \n\n Cerrando Sesión.");
												op1 = 3;
												break;
											}else{
												System.out.println("Contraseña Incorrecta, intenta nuevamente.");
											}
										}
									}
									break;
								case 2:	
									for(int i = 0; i <=3; i++){
										System.out.println("");
										System.out.println("Por favor, ingrese su actual contraseña:");
										System.out.print("->");
										e_pw = in.nextLine();
										System.out.println("");
										if (e_pw.equals(pw)){
											System.out.println("Ahora ingresa por favor tu nueva contraseña:");
											System.out.print("->");
											e_pw = in.nextLine();
											System.out.println("");
											System.out.println("Por favor, confirma tu nueva contraseña:");
											System.out.print("->");
											e_cpw = in.nextLine();
											System.out.println("");
											if(e_cpw.equals(e_pw)){
												System.out.println("La contraseña ha sido cambiada con éxito.");
												pw = e_pw;
												i = 10;
											}else{
											 	if(i == 3){
													System.out.println("Demasiados intentos. \n\n Cancelando proceso. \n\n Cerrando sesión.");
													break;
												}else{
													System.out.println("Las claves no coinciden, intenta nuevamente.");
												}
											}
										}else{
											if(i == 3){
												System.out.println("Demasiados intentos. \n\n Cancelando proceso. \n\n Cerrando sesión.");
												break;
												
											}else{
												System.out.println("Las claves no coinciden, intenta nuevamente.");
											}
										}
									}
									break;
								case 3:
									System.out.println("Gracias por usar nuestra plataforma. ¡Esperamos verte pronto!");
									break;
								default:
									System.out.println("Perdón, la opción que escogiste no es correcta. Intenta de nuevo.");
									break;
							}	
						
						}else{
							if(j==3){
								System.out.println("Demasiados intentos. \n\n Cancelando proceso.");		
							}else{
								System.out.println("Credenciales incorrectas. Intenta nuevamente");
							}
						}
					}
					break;
					
						
				case 2:
					System.out.println("¡Bienvenido!\n Muchas gracias por unirte a nuestra plataforma \n Solo necesitamos que nos brindes unos datos:");
					System.out.println("Dime como te llamas");
					System.out.print("->");
					name = in.nextLine();

					System.out.println("");
					System.out.println("Dame un nombre de usuario para tus credenciales.");
					System.out.print("->");
					user = in.nextLine();
					System.out.println("");
					for(int i = 0; i <= 3; i++){
						System.out.println("Ahora crea una contraseña por favor");
						System.out.print("->");
						e_pw = in.nextLine();
						System.out.println("Por favor vuelve a escribir tu contraseña.");
						System.out.print("->");
						e_cpw = in.nextLine();
						if(e_cpw.equals(e_pw)){
							pw = e_pw;
							System.out.println("¡Gracias por unirte! \n Esperamos disfrutes nuestra plataforma. \n Ya puedes iniciar sesión.");
							break;
						}else{
							if(i == 3){
								System.out.println("Demasiados intentos. Por favor intenta de nuevo más tarde.");
								op1 = 3;
								break;
							}else{
								System.out.println("No coincide la contraseña que confirmas. Intenta de nuevo.");
							}
						}
					}
					break;
				case 3:
					System.out.println("¡Gracias por visitarnos! Esperamos tenerte aquí nuevamente muy pronto.");
					break;
			}
		}
	}
}