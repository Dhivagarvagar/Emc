package clas_ob;
import java.util.*;
class Box {
	int width;
	int height;
	double depth;
	void getVolume(int w ,int h,double d) {
		width=w;
		height=h;
		depth=d;
	}
	int display() {
		return width*+height*+(int)depth;
	}
}
public class Box1 {
	public static void main(String [] args) {
		Box b=new Box();
		b.getVolume(10, 20, 10);
		int vol=b.display();
		System.out.println(vol);
		
	}
}
