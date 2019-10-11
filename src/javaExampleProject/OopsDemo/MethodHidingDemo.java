/*
 * In override method if both are static then method hiding occure not override
 * Method resolution takes place by compiler based on object type. 
 */
package javaExampleProject.OopsDemo;

class Fruits{
	static void name() {
		System.out.println("fruit class");
	}
}
class Mango extends Fruits{
	static void name() {
		System.out.println("mango fruit");
	}
}
public class MethodHidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits f=new Fruits();
		f.name();
		Mango m=new Mango();
		m.name();
		Fruits f1=new Mango();
		f1.name(); //parent class
	}

}
