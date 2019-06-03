package array_problems;
import java.util.*;
public class Sum_using_condition_9 {
	public static void main(String [] args) {
	int[]arr = {2,4,8,6,8,7,10,100};
	int inx6=0,inx7=0;
	int a=0;
	int	sum=0;
	int	b= 0;
	for(int i=0;i<arr.length;i++)
	{			
			if(arr[i]==6 && a== 0)
			{
				inx6=i;
				a++;
			}			
			if(arr[i]==7 && b== 0)
			{
				inx7=i;
				b++;
			}			
	}		
		if(inx6<inx7 && a!=0 && b!=0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(i<inx6 || i>inx7)
				{
					sum=sum+arr[i];
				}
			}
			System.out.println(sum);
		}
		else {
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			System.out.println(sum);
		}
	}
}
