package flowcontrol;
import java.util.Scanner;
public class Reverse_17 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a>0) {
			System.out.print(a%10);
			a =a/10;
		}
	}
	
}
