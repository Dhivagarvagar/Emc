package flowcontrol;
import java.util.*;
public class Pirime_no_13 {
	public static void main(String [] args) {
		 int count=0;
		for(int i=10;i<=99;i++) {
			for(int j=2;j<=i/2;j++ ) {
				if(i%j ==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			count=0;
		}
		}
}