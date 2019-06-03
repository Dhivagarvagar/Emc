package array_problems;
import java.util.*;
public class Highest_duplicate_8 {
		public static void main(String [] args) {
			int[] arr = {10,20,10,30,40,100,99};
			int a=0, max=0, b=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						b++;
					}				
				}
				if(max<=b)
				{
					max=b;
					a=i;
				}
				b=0;
			} 
			System.out.println(arr[a]);
		}
}
