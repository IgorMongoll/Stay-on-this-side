package shilds_lessons_package;

class ChainExcDemo {

	public static void main(String[] args) {
		final char a='A', d='D';
		char gerade='B';
		
		switch (gerade) {
			
		case a:
		case 'B': System.out.print("great");
	
		case 'C': System.out.print("good"); break;
		
		case d:
		case 'F': System.out.print("not good");
	}
}
}