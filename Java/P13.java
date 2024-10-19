public class P13{
	
	public static void main(String args[]){
		
		int a = 0, b = 1, c = 0, i = 0;
		
		do{
			System.out.print(a+", ");
			c = a + b;
			a = b;
			b = c;
			i++;
		}while(i<9);
		System.out.print(a+".");
	}
}