package shilds_lessons_package;

class MyException extends Exception {

	private int detail;

	MyException(int a) {

		detail = a;
	}

	@Override
	public String toString() {

		return "MyException[" + detail + "]";
	}
}

class ExceptionDemo {
static void compute(int a) throws MyException {
	System.out.println("Generate method compute :(" +a+")");
	if (a>10) {
	throw new MyException(a);
	}
	System.out.println("Normal Stop");

}

	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
			compute(3);
		} catch (MyException e) {
			System.out.println("Catched Exception : "+e);

		}

	}

}
