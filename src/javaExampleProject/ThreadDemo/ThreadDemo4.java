package javaExampleProject.ThreadDemo;

class MyThread4 extends Thread {
	public void start() {
		super.start();
		System.out.println("start() method");
	}

	public void run() {
		System.out.println("run method");
	}
}

class ThreadDemo4 {
	public static void main(String arg[]) {
		MyThread4 t = new MyThread4();
		t.start(); // it starts the thread
		System.out.println("main method");
	}
}