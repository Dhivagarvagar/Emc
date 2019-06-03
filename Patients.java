package clas_ob;
import java.util.*;
	class Patient{
		String name= "DHIVA";
		 double height;
		 double weight;
		  double BMI;
		 public   double pat(double height,double weight){
			 return BMI=(weight/(height*height))*703;
		    }
		 }
public class Patients {
	public static void main(String [] args) { 
	Patient p=new Patient();
	double val = p.pat(65.32,170.5);
	System.out.println("Your BMI is:"+val);
	if(val >= 24.9 && val <=29) {
		System.out.println("And you are overweight " + ":" +val);
	}
	else if(val >=18.5 && val <=24.8){
		System.out.println("And You are so healthy "+":"+val);
	}
	else if(val<18.5){
		System.out.println("And You are below normal health"+":"+val);
	}
	else {
		System.out.println("And you are not healthy"+":"+val);
	}
	}
}
