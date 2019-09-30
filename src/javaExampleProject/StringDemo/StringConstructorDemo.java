package javaExampleProject.StringDemo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		//Default Constructor
		String s = new String();
		//Parameterized Constructor
		char chars[] = { 'a', 'b', 'c' };
		String s1 = new String(chars);
		char charss[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s2 = new String(charss, 2, 3);
		String s3 = new String(s1);
		byte ascii[] = {65, 66, 67, 68, 69, 70 };
		String s4 = new String(ascii,2,3);
		System.out.println("s="+s);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("s4="+s4);
	}

}
