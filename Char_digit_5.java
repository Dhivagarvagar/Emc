package flowcontrol;
import java.util.*;
public class Char_digit_5 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if((a>=65 && a<=90) || (a>=97 && a<=122)) {
			System.out.println("The given value is an Alphabet");
		}
		else if(a>=48 && a<=57) {
			System.out.println("The given value is an Digit");
		}
		else {
			System.out.println("The given value is a special character");
		}
		
	}
}
