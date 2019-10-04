package javaExampleProject.OopsDemo;

class Test{
	void m1(int i) {
		System.out.println("int arg");
	}
	void m1(float f) {
		System.out.println("float arg");
	}
}

public class OverloadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.m1(3);
		t.m1(9.4f);
		//byte-->short-->int-->long-->float-->double
		//char-->int-->long-->float-->double
		t.m1('s'); // auto upgradation occure as there is no method for char.
		
	}

}
