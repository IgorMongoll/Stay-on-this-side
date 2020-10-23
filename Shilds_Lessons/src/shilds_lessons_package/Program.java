package shilds_lessons_package;
class  A_class{
    int i,j;
    A_class(int a, int b){
        i=a;
        j=b;
    }
   
    void show(){
     System.out.println("a A class :"+i);  
    }
} 
class B extends A_class{
    int k;
    B(int a,int b,int c){
     //   super a=a;
       // super b=b;
    
       super(a,b);
       // super.b=b;
        k=c;
    }
        @Override
		void show(){
        	super.show();
        System.out.println("k class B : "+k );
        }
        
        void show(String s) {
        	System.out.println(s+k);
        }
} 

public class  Program
{
    public static void main(String[] args) {
        B obj1 =new B(1,2,3);
       // System.out.println();

        obj1.show();
        obj1.show("This is show() from B class : ");
    }
}
