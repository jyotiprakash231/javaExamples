package javaExampleProject.ThreadDemo;
// by implementing runnable interface
class MyThread5 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("myThread");
		}
	}
}

public class ThreadDemo5 {
	public static void main(String arg[]) {
		MyThread5 r = new MyThread5();
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
		}
	}
}
