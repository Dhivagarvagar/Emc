package array_problems;
import java.util.*;
public class Duplicate_elements_7 {
	public static void main(String [] args) {
		int ar[] = {77,7,77,3,45,99};
		int a=ar.length;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(ar[i]==ar[j])
				{
					for(int k=j;k<a-1;k++)
					{
						ar[k] = ar[k+1];
					}
					a--;
					j--;
				}
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(ar[i] +" ");
		}
	}
}
