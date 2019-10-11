package javaExampleProject.OopsDemo;

class Vehicle{
	int no=10;
	void getWheel(){
		System.out.println("0 wheel in vehicle class");
	}
}
class Car extends Vehicle{
	int no=12;
	void getWheel() {
		System.out.println("4 wheels in car class");
	}
}
public class OverriddingDemo1 {

	public static void main(String[] args) {
		// run time polymerphism 
		// method resolution done by JVM based on run time object
		// so here it shows vehicle class details
		Vehicle obj=new Vehicle();
		obj.getWheel();
		System.out.println("no of vehicle:"+obj.no);
		//car class details
		Car carObj=new Car();
		carObj.getWheel();
		System.out.println("no of cars:"+carObj.no);
		//car class details as run time object is belongs car class
		Vehicle obj1=new Car();
		obj1.getWheel();
		System.out.println("no of car:"+obj1.no);
	}

}
