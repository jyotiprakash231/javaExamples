package javaExampleProject;


class ExampleOfObject{
	void m1() {
		System.out.println("inside m1() ExampleOfObject class");
	}
}
class InheritedOfObject extends ExampleOfObject{
	void m2() {
		System.out.println("inside m2() of inherited class");
	}
}

public class ExampleSampleForTest {

	public static void main(String[] args) {
		InheritedOfObject obj=new InheritedOfObject();
		obj.m1();

	}

}
