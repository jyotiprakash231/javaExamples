package javaExampleProject.OopsDemo;

class Test5{
	void m1(int i,float f) {
		System.out.println("int float method");
	}
	void m1(float f,int i) {
		System.out.println("float int method");
	}
}

public class OverloadingDemo5 {

	public static void main(String[] args) {
		Test5 t=new Test5();
		t.m1(12, 12.04f);
		t.m1(23.3f, 23);
		// t.m1(10, 11); ---> it will give ambigious error. as it can satisfy both method.
		
	}

}
