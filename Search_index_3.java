package array_problems;
import java.util.*;
public class Search_index_3 {
		public static void main(String [] args) {
			Scanner scan = new Scanner(System.in);
			int num[]  = {1, 2, 3, 5,6};
			int count=0;	
			System.out.println("Enter the Number to search in the Array");
			int searchElement = scan.nextInt();
			for(int i=0; i<num.length; i++)
			{
				if(searchElement == num[i])
				{
					count++;
					System.out.print("The Corresponding index value:" +(i+1));
					break;
				}
			}
					if(count==0)
					{
						System.out.println("-1");
					}
						scan.close();
	}
}
