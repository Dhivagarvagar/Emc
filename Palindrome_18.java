package flowcontrol;
import java.util.*;
public class Palindrome_18 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int s=0;
		int t=a;
		while(a>0) {
			int r=a%10;
			s=s*10+r;
			a=a/10;
		}
		if(t==s) {
			System.out.println("The Given Value is Palindrome");
		}
		else {
			System.out.println("The Given Value is Not Palindrome ");
		}
	}
}
