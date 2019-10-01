package javaExampleProject.StringDemo;
import java.util.*;

public class ReverseStringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String string=sc.nextLine();
		StringBuffer inputString=new StringBuffer(string);
		System.out.println("Reverse String is : "+inputString.reverse());
	}
}
