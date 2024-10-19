public class P12{
	
	public static void main(String args[]){
		
		int i = 1;

		for(i = 1 ; i <= 9; i++){
			
			System.out.print( i + ", ");
		}

		System.out.println( i + ".");
		
		System.out.println("");
		
		int j=99;
		int k=1;

		while(j >= 96){
			System.out.print( k + ", " + j + ", ");
			j-=1;
			k++;

		
		}
		System.out.print( k + ", " + j + ". "); 
	}
}