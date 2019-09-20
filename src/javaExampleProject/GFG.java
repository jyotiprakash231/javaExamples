package javaExampleProject;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=1;i<=testCase;i++){
		    int oddSum=0;
		    int evenSum=0;
		    int num=sc.nextInt();
		    for(int j=1;j<=num;j++){
		        if(num%2==0){
		            evenSum+=num;
		        }
		        else{
		            oddSum+=num;
		        }
		        System.out.println(evenSum+" "+oddSum);
		    }
		}
	}
}