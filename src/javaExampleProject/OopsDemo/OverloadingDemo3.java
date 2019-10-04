package javaExampleProject.OopsDemo;

class Test3{
	void m1(String s) {
		System.out.println("string arg");
	}
	void m1(StringBuffer sb) {
		System.out.println("stringbuffer arg");
	}
}

public class OverloadingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t=new Test3();
		t.m1("hi");
		t.m1(new StringBuffer("hii"));
		//t.m1(null); ----> it gives ambiguity error as both string and stringbuffer are child class of object class.
		
	}

}
