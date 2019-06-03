package flowcontrol;
import java.util.*;
public class Percentage_intrest_6 {
	 public static void main(String[] args) {
			int age=Integer.parseInt(args[1]);
			if(args[0].equalsIgnoreCase("female")&&((age>=1)&&(age<=58))){
				System.out.println("Interest == 8.2%");
			}
			else if(args[0].equalsIgnoreCase("female")&&((age>=59)&&(age<=120))) {
				System.out.println("Interest == 7.6%");
			}
			else if(args[0].equalsIgnoreCase("male")&&((age>=1)&&(age<=60))) {
				System.out.println("Interest == 9.2%");
				
			}
			else if(args[0].equalsIgnoreCase("male")&&((age>=61)&&(age<=120))) {
				System.out.println("Interest == 8.3%");
			}
 
     }
}    