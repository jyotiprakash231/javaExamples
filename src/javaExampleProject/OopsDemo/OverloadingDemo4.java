package javaExampleProject.OopsDemo;

class Test4{
	void m1(int... i) {
		System.out.println("var arg method");
	}
	void m1(int i) {
		System.out.println("normal method");
	}
}

public class OverloadingDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t=new Test4();
		t.m1(3); // satisfy both method signature but var arg is always least priority than normal method.
		t.m1(null);
		t.m1(12,23);
	}

}
