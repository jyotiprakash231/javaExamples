package javaExampleProject.Basic;

public class SwitchCaseDemo 
{ 
    public static void main(String args[]) 
    { 
        int i = 4; 
        switch (i) 
        { 
        case 0:  
        case 1: 
        case 2: 
            System.out.println("i is two or less than two."); 
            break; 
        case 3:
        	System.out.println("i is three.");
        	break;
        case 4:
        	System.out.println("i is four");
        	break;
        case 5:
        	System.out.println("i is five.");
        	break;
        case 6:
        	System.out.println("i is six.");
        	break;
        default: 
            System.out.println("i is greater than six."); 
        } 
    } 
}