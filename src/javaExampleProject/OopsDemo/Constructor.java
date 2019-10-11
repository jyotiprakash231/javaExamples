/*
 * If method name same as class name it is known as constructor
 * constructor don't have any return type even not void
 * if two methods present with different arg with same name as class then constructor overloading occure
 * if we put any return type in constructor method then compiler treated it as a normal method
 * every class have default constructor
*/
package javaExampleProject.OopsDemo;


class ConstructorDemo{
	ConstructorDemo(){
		System.out.println("no arg constructor");
	}
	ConstructorDemo(int i){
		System.out.println("int arg constructor");
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo d=new ConstructorDemo(4);
		
	}

}
