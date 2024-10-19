public class P04{

	public static void main(String args[]){
		
		int Mat = 10;
		int Bio = 8;
		int Qui = 9;

		float Prom;
		
		Prom = (Mat + Bio + Qui)/3;

		if(Prom > 6){
		System.out.println("El alumno aprobo");
		}else{
		System.out.println("El alumno reprobo"); 
		}
	}
}