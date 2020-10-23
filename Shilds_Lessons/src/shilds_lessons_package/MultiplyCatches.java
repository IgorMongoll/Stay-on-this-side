package shilds_lessons_package;

//import java.util.Random;

public class MultiplyCatches {

	public static void main(String[] args) {
		
	//	Scanner s=new Scanner(System.in);
	
		//s.nextLine()	
	
//		args=s.hasNextLine()
		try {
			int a=args.length;
			//int a=2;
			System.out.println("a: "+a);
			
			int b=42/a;
			
			int c[]= {8};
			c[2]=15;
			
			
		} catch (ArithmeticException e) {
			
			System.out.println("Dividieren durch 0: "+e);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("After block try/catch");
		}
	}

}
