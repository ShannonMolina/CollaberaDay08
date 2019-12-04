package questions;

// What will be the output of the following program?

class AA{
	int i =1;
	
	class B{
		int i=2;
		
		class C extends AA{
			void methodC() {
				System.out.println(i);
			}
		}
	}
}

public class Q5 {

	public static void main(String[] args) {
		AA.B.C obj = new AA().new B().new C();
		obj.methodC();

	}

}
