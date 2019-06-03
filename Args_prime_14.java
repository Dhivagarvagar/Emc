package flowcontrol;
import java.util.*;
public class Args_prime_14 {
	public static void main(String [] args) {
		if(args.length == 0) {
			System.out.println("Please Enter an integer number");
		}
		else if(args.length>0) {
			int a=Integer.parseInt(args[0]);
			if(a ==0 || a==1) {
				System.out.println(args[0]+" "+" is neither prime nor composite");
			}
		     else {
		    	 boolean b=true;
		    	 for(int i=2;i<a;i++) {
		    		 if(a%i==0){
		    			 b=false;
		    			 break;
		    		 }
		}
		    	 if(b) {
		    		 System.out.println("The given Value is Prime no");
		    	 }
		    	 else {
		    		 System.out.println("The given value is Not Prime no");
		    	 }
		}
	}
}
}