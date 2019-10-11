package javaExampleProject.OopsDemo;

public class RecursiveMethod {
	void m1() {
		m2();
	}
	void m2() {
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMethod obj=new RecursiveMethod();
		obj.m1(); // StackOverflowError occure.
	}

}
