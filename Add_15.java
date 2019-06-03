package flowcontrol;
import java.util.*;
public class Add_15 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a=sc.nextInt();
		String i=""+a;
		for(int t=0;t<=i.length();t++) {
			sum=sum + (a % 10);
			a /=10;
		}
		System.out.println(sum);
	}
}
