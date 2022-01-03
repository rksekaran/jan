
public class E {

	private void method1(int a) {
for (int i = 1; i <= a; i++) {
	if(i%2==1) {
		System.out.println(i);
	}
	
}
	}
	
	
	public static void main(String[] args) {
		E a=new E();
		a.method1(20);
		 
	}

}
