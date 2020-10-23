package shilds_lessons_package;

import java.util.Random;


public class HandleError {

	public static void main(String[] args) {
	int a=0, b=0,c=0;
	Random r= new Random();
	
	
		
	for (int i=0;i<10;i++){
	try {
	c=r.nextInt();
	b=r.nextInt();	
	
	a=12345/(b/c);
	
	System.out.println("a :"+a);
	}
	catch (ArithmeticException e) {
		System.out.println("ISKLUCHENIJE :"+e);
		a=0;
	}
	
	}
	
	

	
	}

}
