package clas_ob;
import java.lang.Math;
class Calculator{
	public static int powerInt(int num1,int num2) {
	return (int) Math.pow(num1,num2);	
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1,num2);
	}
}

public class Clas_ob_2 {
	public static void main(String [] args) {
		Calculator c;
		System.out.println(Calculator.powerInt(2, 4));
		System.out.println(Calculator.powerDouble(2.5, 5));
	}
}
