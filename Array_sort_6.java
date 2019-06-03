package array_problems;
import java.util.*;
public class Array_sort_6 {
	public static void main(String [] args) {
		int[] ar = {22,5,66,32,1,42};
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i] > ar[j])
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
    }
}
