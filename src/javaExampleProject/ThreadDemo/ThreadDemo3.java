package javaExampleProject.ThreadDemo;

class MyThread3 extends Thread {
	public void start() {
		System.out.println("start() method");
	}

	public void run() {
		System.out.println("run method");
	}
}

public class ThreadDemo3 {
	public static void main(String arg[]) {
		MyThread3 t = new MyThread3();
		t.start(); // it acts as a normal method.
	}
}
