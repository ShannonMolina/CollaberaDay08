package multiInterface;

public interface I2 {
	default public void method() {
		System.out.println("Hello from I2");
	}
}
