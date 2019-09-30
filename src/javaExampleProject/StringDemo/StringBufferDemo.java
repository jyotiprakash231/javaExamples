package javaExampleProject.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer();
		System.out.println("allocated capacity: "+s.capacity());
		StringBuffer s1=new StringBuffer("Hii Jyoti");
		System.out.println("allocated size: "+s1.length());
		System.out.println("capacity: "+s1.capacity());
		StringBuffer s2=new StringBuffer("Hello");
		s2.setCharAt(1, 'i');
		System.out.println("new capacity before ensureCapacity: "+s2.capacity());
		s2.ensureCapacity(50);
		s2.setLength(2);
		System.out.println("new capacity after ensureCapacity: "+s2.capacity());
		System.out.println("new string: "+s2);
		System.out.println("length: "+s2.length());
		int a = 42;
		StringBuffer sb = new StringBuffer(40);
		sb.append("a = ").append(a).append("!").toString();
		System.out.println(sb);
		System.out.println("adding a string inside: "+sb.insert(1, "hi"));
		System.out.println("reverse: "+s1.reverse());
		System.out.println("after delete a char: "+sb.deleteCharAt(0));
		System.out.println("after delete: "+sb.delete(2,3));
		
	}

}
