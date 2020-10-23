package shilds_lessons_package;



//Даже если ты считаешь себя нужным людям 

class Box{
	double weight;
	double height;
	double depth;
	
	Box() {
		weight=-1;
		height=-1;
		depth=-1;
		
	}
	
	Box (double w,double h,double d) {
		weight=w;
		height=h;
		depth=d;
	}
	Box (double i){
		weight=height=depth=1;
	}
	
	double volume() {
		return weight*height*depth;
		
	}
}

public class Constructor_OverLoad {

	public static void main(String[] args) {

		double v;
		
		Box box1=new Box();
		v=box1.volume();
		System.out.println("Box1: "+v);
		
		Box box2=new Box(1,2,3);
		v=box2.volume();
		System.out.println("Box2 1,3,2: "+v);
		
		Box myCube=new Box(2);
		v=myCube.volume();
		System.out.println("BoxCube: "+v);
	}

}
