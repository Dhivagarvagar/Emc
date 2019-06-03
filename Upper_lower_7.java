package flowcontrol;
import java.util.*;
public class Upper_lower_7 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		String b=Character.toString(a);
		if(a>=65 && a<=90) {
			System.out.print(a+"->"+b.toLowerCase());
		}
		else {
			System.out.print(a+"->"+b.toUpperCase());
		}
	}
}
