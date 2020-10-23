package shilds_lessons_package;

class OverloadeDemo {
	void test() {
		System.out.println("Метод без параметров");
	}
	
/*	void test (int a) {
		
		System.out.println(" С параметром int:"+a);
	}
	*/
	void test(int a, int b) {
		
		System.out.println(" С параметрами int int:"+a+" & "+b);
	}
	
	void test(double a) {
		
		System.out.println(" С параметрами double:"+a);
	}
	int test(int a) {
		
		System.out.print(" С параметрами int SUM:"+a+"+"+a);
		return a+a;
	}
}

public class Methods_OverLoad {

	public static void main(String[] args) {
		
		OverloadeDemo obj=new OverloadeDemo();
		int i=89;
		double a=23.63;
		
		
		obj.test();
		obj.test(0);
		obj.test(125.36);
		obj.test(a);
		obj.test(i, 8);
		int s=obj.test(5);
		System.out.println("="+s);
	}

}
