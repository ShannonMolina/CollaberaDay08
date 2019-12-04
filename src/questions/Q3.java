package questions;

// What will be the output of the program?

class A{
	int a = 111;
	
	static class B extends A{
		int b = a + 222;
	}
	
	class C extends A.B{
		int c = b + 333;
	}
}
public class Q3 {

	public static void main(String[] args) {
		A.C c = new A().new C();
		
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		

	}

}
