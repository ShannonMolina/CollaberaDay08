package multiInterface;

public interface I1 {
	default public void method() {
		System.out.println("Hello from I1");
	}
}
