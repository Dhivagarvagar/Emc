package array_problems;
import java.util.*;
public class Add_avg_1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] arr = {a,b};
		int add = 0;	
		double avg=0;
			for(int i=0;i<arr.length;i++)
		{
					add =add+arr[i];
					avg= (double) add / arr.length;
		}
				System.out.println("ADD :" + add);		
				System.out.println("AVG :" + avg); 
	}
}
           