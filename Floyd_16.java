package flowcontrol;
import java.util.*;
public class Floyd_16 {
	public static void main(String [] args ) {
		if(args.length==0) {
			System.out.println("Please enter an integer number ");
		}
		else {
			int a=Integer.parseInt(args[0]);
		for(int i=1;i<=a; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
           }		
		}
	}
	
}
