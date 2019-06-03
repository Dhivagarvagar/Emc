package array_problems;
import java.util.*;
public class Min_max_2 {
	public static void main(String [] args) {
		int num[]  = {5,6,880,33,-1};
		int max=num[0];
		int min=num[0];
		 	for(int i=0;i<num.length;i++)
		 	{
		 		if(num[i]>max) 
		 		{
				 max=num[i];
		 		}
		 			else if(num[i]<min) 
		 			{
		 				min=num[i];
		 			}
		 	}
		 System.out.println("Max:" +max);
		 System.out.println("Min:" +min);
	 }
}
