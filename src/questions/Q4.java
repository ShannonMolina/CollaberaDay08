package questions;

// What will be the output of this program?

class ABC {
	class XYZ{
		String s = "Inner - XYZ";
	}
}

class XYZ extends ABC{
	String s = "Outer - XYZ";
	class ABC extends XYZ{}
}

public class Q4 {

	public static void main(String[] args) {
		XYZ obj1 = new XYZ();
		XYZ.ABC obj2 = new XYZ().new ABC();
		System.out.println(new XYZ().new ABC().s);

	}

}
