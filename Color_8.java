package flowcontrol;
import java.util.*;
public class Color_8 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		String b=Character.toString(a);
		String clr=b.toUpperCase();
		switch(clr) {
		    case "R":{
			    System.out.print("R->"+"Red");
			    break;
		   }
		    case "B":{
		    	System.out.print("B->"+"Blue");
		    	break;
		   }
		    case "G":{
		    	System.out.print("G->"+"Green");
		    	break;
		   }
		    case "O":{
		    	System.out.print("O->"+"Orange");
		    	break;
		   }
		    case "Y":{
		    	System.out.print("->Y"+"Yellow");
		    	break;
		   }
		    case "W":{
		    	System.out.print("->W"+"White");
		    	break;
		   }
		    default:{
		    	System.out.print("Invalid Code");
		    	break;
		    }
		}
	}
}
