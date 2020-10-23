package shilds_lessons_package;

public class Exeptions_Training_1 {

	public static void main(String[] args) {
		
		int d, a;
		try {
			d=0;
			a=42/d;
			
			System.out.println("It is out of veiw");
		} catch (ArithmeticException e) {
			System.out.println("Exeption Dividieren durch 0");
		
		}
		System.out.println("Affter catch");
	}

}
