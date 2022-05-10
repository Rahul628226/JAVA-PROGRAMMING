/* Area of different shapes using overloaded functions  */

class Shapes{
	double x;
	Shapes(double a){
		x=a;
	}
}

class Square extends Shapes{
	Square(double a){
		super(a);
	}
	void area(double x){
		System.out.println("Area of square="+(x*x));
	}
}

class Rectangle extends Shapes{
	double y;
	Rectangle(double a,double b){
		super(a);
		y=b;
	}
	void area(double x,double y){
		System.out.println("Area of rectangle="+(x*y));
	}
}

class Circle extends Shapes{
	Circle(double a){
		super(a);
	}
	void area(double x){
		System.out.println("Area of circle:"+(3.14*x*x));
	}
}
class Area{
	public static void main(String ar[]){
		
		Rectangle r=new Rectangle(8,6);
		Square s=new Square(4);
		Circle c=new Circle(3);
		Shapes ref;
		ref=r;
		r.area(4,5);
		ref=s;
		s.area(4);
		ref=c;
		c.area(2);
	}
}
