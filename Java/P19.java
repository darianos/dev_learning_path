public class P19{
	
	public static void main(String args[]){
		
		int num[][]= new int[2][2];
		num[0][0]=5;
		num[0][1]=2;
		num[1][0]=2;
		num[1][1]=5;

		System.out.println("La matriz es:");
		for (int i = 0; i < 2; i++){	

			for (int j = 0; j < 2; j++){
			
				System.out.print("[" + num[i][j] + "]");	
			}

			System.out.println("");
		}
	}
}