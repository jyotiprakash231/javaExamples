package javaExampleProject;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println(list.getClass());
		list.add(null);
		list.add("A");
		list.add(2,null);
		list.add(2, "hi");
		list.add(10);
		boolean b=list.add("hi how are you");
		System.out.println(b);
		System.out.println(list.size());
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.set(4, "no");
		System.out.println(list);
		//list.get(4);
		System.out.println(list.get(4));
	}

}
