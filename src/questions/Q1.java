package questions;

// What will be the output of this program?

	abstract class X{
		static String s1 = "STATIC";
		String s2 = "NON-STATIC";
		abstract void methodX();
	
	
		static abstract class Y{
			String s1 = "NON_STATIC";
			static String s2 = "STATIC";
			abstract void methodY();
		}
	}
public class Q1 {

	public static void main(String[] args) {
		new X() {
			void methodX() {
				System.out.println(s1+ " " +s2);
			}
		}.methodX();

		new X.Y() { 								// We can only instantiate Y because it is static.
			void methodY(){							// Only static classes can be instantiated from 
				System.out.println(s1 + " " +s2);	// abstract classes
			}
		}.methodY();
	}

}
