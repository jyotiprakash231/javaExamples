package javaExampleProject.StringDemo;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s="Hi How are you ?";
		System.out.println(s.charAt(8));
		System.out.println(s.toCharArray());
		char[] a=s.toCharArray();
		System.out.println(a);
		for(char c:a) {
			System.out.println(c);
		}
		int start = 4;
		int end = 9;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		System.out.println(s.getBytes());
		String s1="hello";
		String s2="HELLO";
		String s3="hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}

}
