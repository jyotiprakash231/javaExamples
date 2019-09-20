package javaExampleProject.Basic;

class Variable{
	//instance variable
	int NumberOne;
	//static variable
	static int NumberTwo=50;
	void methodOne() {
		
	}
}

public class ExampleOfVariables {

	public static void main(String[] args) {
		//local variable
		int NumberOne=4;
		System.out.println("Local variable:"+NumberOne);
		//creating object for class Variable to call static and instance variable
		Variable objectOne=new Variable();
		Variable objectTwo=new Variable();
		System.out.println("Instance variable:"+objectOne.NumberOne);//print default value
		objectTwo.NumberOne=40;//assigning value
		System.out.println("Instance variable:"+objectTwo.NumberOne);//value different for all objects
		System.out.println("Static variable:"+Variable.NumberTwo);// we can call through any object or using class name , but value for all object will be same
	}

}
