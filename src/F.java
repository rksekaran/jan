

public class F {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int fib=0;
		
		for (int i = 0; i <10; i++) {
			
			fib=n1+n2;
			n1=n2;
			n2=fib;
			
			System.out.println(fib);
	
			
		}
		
	}

}
