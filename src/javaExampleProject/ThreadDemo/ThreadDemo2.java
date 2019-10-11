package javaExampleProject.ThreadDemo;

class MyThread2 extends Thread{
	//we are not providing any run method for over ride
	//run method in Thread class contains no statement 
	//so the program returns nothing.
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t=new MyThread2();
		t.start();
	}

}
