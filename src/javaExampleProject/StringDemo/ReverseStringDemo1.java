package javaExampleProject.StringDemo;
import java.util.*;

public class ReverseStringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String inputString=sc.nextLine();
		String reverseString="";
		char[] arr=inputString.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			reverseString+=inputString.charAt(i);
		}
		System.out.println("Reverse String is: "+reverseString);
	}

}
