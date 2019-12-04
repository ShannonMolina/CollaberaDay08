package multiInterface;

/* 
 * Interfaces are used to share common behavior among instances of different classes.
 * Whereas Inheritance is used to share common code (data members and methods)
 * among instances of related classes.
 *
 * Multiple Inheritance is only possible between interfaces, not classes. A class can 
 * only extend one super class, but it can implement many interfaces. Interfaces may extend
 * other interfaces as well.
 * 
 * A major difference between abstract classes and interfaces is that a class may only
 * extend one abstract class, whereas it can implement one or many interfaces.
 */


public class MultipleInterfaces implements I1, I2{ // error because duplicate default methods in I1 and I2
												  // the compiler does not know which one to use

	public static void main(String[] args) {
		MultipleInterfaces obj = new MultipleInterfaces();
		obj.method();

	}
	
	//unless you override the method
	@Override
	public void method() {
		System.out.println("Hello from method");
	}

}
