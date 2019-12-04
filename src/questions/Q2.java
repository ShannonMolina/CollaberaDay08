package questions;

// How do you access the field 'i' of InnerClass in the below example?

class OuterClass1{
	static class InnerClass1{
		static int i;
	}
}

class OuterClass2{
	static class InnerClass2{
		int i;
	}
}

class OuterClass3{
	class InnerClass3{
		int i;
	}
}

public class Q2 {
	public static void main(String[] args) {
		
		// Don't need to instantiate any class
		int myInt1 = OuterClass1.InnerClass1.i; 
		
		// Need to instantiate inner class
		int myInt2 = new OuterClass2.InnerClass2().i;
		
		// Need to instantiate outer class and inner class
		int myInt3 = new OuterClass3().new InnerClass3().i;
	}
}
