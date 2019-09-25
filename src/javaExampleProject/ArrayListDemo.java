package javaExampleProject;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(null);
		list.add("A");
		list.add(2,null);
		list.add(2, "hi");
		System.out.println(list.size());
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}
