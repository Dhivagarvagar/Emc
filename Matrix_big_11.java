package array_problems;
import java.util.*;
public class Matrix_big_11 {
		public static void main(String [] args) {
			if(args.length < 9)
			{
				System.out.println("Please enter 9 integer values");
			}
			else {
				int[][] arr = new int[3][3];
				int a=0;
				int max = Integer.parseInt(args[0]);
				System.out.println("The Given Array Is:");
				for(int i=0; i<3; i++)
				{
					for(int j=0; j<3; j++)
					{
						arr[i][j] = Integer.parseInt(args[a++]);
						if(max <= arr[i][j])
						{
							max = arr[i][j];
						}
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("The Biggest Number In The Given Array is:");
				System.out.println(max);
			}
		}
}
