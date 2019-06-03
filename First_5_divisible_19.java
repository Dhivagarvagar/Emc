package flowcontrol;
import java.util.*;
public class First_5_divisible_19 {
	public static void main(String [] args) {
			int a=1;
			 int count=0;
			while(a>0) {
	             if(a%2==0 && a%3==0 && a%5==0) {
	            	 System.out.println(a);
	            	 count++;
	             }
	             a++;
	             if(count==5) {
	     			break;
	     		}

			}
	}
}
