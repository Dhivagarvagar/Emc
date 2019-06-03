package flowcontrol;
import java.util.*; 
public class Add_sub_20 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		char d;
		do {
			System.out.println("1.Add \n or \n2.Sub");
				int n=s.nextInt();
			System.out.println("Enter the two numbers");
				int a=s.nextInt();
				int b=s.nextInt();
					if(n==1) 
				{
					System.out.println("The addition of two numbers"+":" +(a+b));
			}
					else if(n==2)
				{
					System.out.println("The subtraction of two numbers"+":" +(a-b));
			}
					System.out.println("Do you want to continue the process");
					 d=s.next().charAt(0);
	    }
					while(d=='y'||d=='Y');
	}
}
  