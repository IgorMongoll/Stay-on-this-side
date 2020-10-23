/**
 * 
 */
package shilds_lessons_package;
 class Test{
	 int a;
	//  public Test() {}
	  
	  public Test(int i) {

	  a=i;
	  }
	  
	  Test incrementByTen() {
		  Test obj=new Test(a+10);
		  return obj;
	  } 
 } 

public class ObjectCallinMethod {

	public static void main(String[] args) {

		Test obj1=new Test(2);
		Test obj2;
		//Test obj2=new Test();
		
		
		
		obj2=obj1.incrementByTen();
		
		System.out.println("obj1.a :"+obj1.a);
		
		System.out.println("obj2.a :"+obj2.a);
		
		obj2=obj2.incrementByTen();
		System.out.println("obj2.a after second increment :"+obj2.a);
		
	}

}
