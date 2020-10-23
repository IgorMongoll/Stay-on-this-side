package shilds_lessons_package;

public class ThrowDemo {

	static void demoproc() {
		
		
		try {
		throw new NullPointerException("DEMO");
		
		System.out.println("Hey");
		
		} catch (NullPointerException n) {
			
			System.out.println("Exception was got in " +"the method  demoproc():"+n);
			throw new NullPointerException("NeW Demo"); //another way to generate  exception
			//throw n;
		}
		}

	
	
	public static void main(String[] args) {
		try {
			demoproc();
			
		}catch (NullPointerException n) {
			System.out.println("Another generation Exception:"+n);
		}

	}

}
