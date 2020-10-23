package shilds_lessons_package;

public class Wrapping {

	public static void main(String[] args) {
		String s="2";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		boolean b= new Boolean("true").booleanValue();
		System.out.println(b);
		
		double d=42.5;
		String doubleString=""+d;
		System.out.println(doubleString);
		
		double d1=87.5;
		String doublString_1=Double.toString(d1);
		System.out.println(doublString_1);
		
		double r1= Math.random();
		int r2=(int)(Math.random()*2);
		
		System.out.println("Random() double: "+r1);
		System.out.println("Random()    int: "+r2);
		
		int i2=12222;
		int i3=5;
		
		int i4=Math.max(i2, i3);
		System.out.println("Math.max():"+i4);
		
		char c='a';
		int res=i2/c;
		System.out.println("Char:"+c+" i2:"+i2+"; i2/Char:"+res);
		
	}

}
