package Case_Study;

public class Method_Overloading {
	void method(String s1) {
		method(s1,s1+s1);
	}
	void method(String s1,String s2) {
		method(s1,s2,s1+s2);
	}
	void method(String s1,String s2,String s3) {
		System.out.println(s1+s2+s3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading mo = new Method_Overloading();
		mo.method("Java ");
		System.out.println();
		mo.method("java","-Programming ");

	}

}
