package flowcontrol;
import java.util.*;
public class Prime_12 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is prime number");
		}
		else {
			System.out.println("it is not prime number");
		}
	}
}
	