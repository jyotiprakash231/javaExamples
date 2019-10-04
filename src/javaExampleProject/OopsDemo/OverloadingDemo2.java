package javaExampleProject.OopsDemo;

class Test2{
	void m1(Object o) {
		System.out.println("object arg");
	}
	void m1(String s) {
		System.out.println("string arg");
	}
}

public class OverloadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2();
		t.m1(t);
		t.m1("hi");
		//object is parent class and string is a child class of object.here method resolution occure according to child class
		t.m1(null);// represent child class method
		t.m1(3);//as it is a integer object(wrapper class)
		
	}

}
