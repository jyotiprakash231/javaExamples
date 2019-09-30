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
		System.out.println("first index of H: "+s.indexOf('H'));
		System.out.println("LAst index of H: "+s.lastIndexOf('H'));
		System.out.println("Substring: "+s.substring(2, 7));
		System.out.println(s.concat(" jyoti"));
		String s4="Jyoti Prakash Sahoo".replace("Jyoti", "Smruti");
		System.out.println(s4);
		System.out.println("lower case: "+s4.toLowerCase());
		System.out.println("upper case: "+s4.toUpperCase());
		
	}

}
