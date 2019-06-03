package array_problems;
import java.util.*;
public class Large_2_small_5 {
	public static void main(String [] args) {
		int arr[] = {52,6,65,2,50,88,10,100};
		int a;
		if(arr.length>=2)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						a=arr[i];
						arr[i]=arr[j];
						arr[j]=a;
					}
				}
			}
			System.out.println("Smallest two nos:"+arr[arr.length-(arr.length)]+" "+arr[arr.length-(arr.length-1)]);
			System.out.println("Largest two nos:"+arr[arr.length-1]+" "+arr[arr.length-2]);
		}
	}
}
 