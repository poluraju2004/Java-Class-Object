/*7.Using this in Constructors: Create a class Rectangle with attributes length and width. Implement a parameterized constructor that initializes these
attributes. Use this to differentiate between class variables and constructor parameters. Include methods to calculate the area and perimeter.*/

class Rectangle{
 	double length;
 	double width;

 	public Rectangle(double l,double w){
 		this.length = l;
 		this.width = w;

 	}
 	public double area(){
 		return (length * width);
 	}
 	public double perimeter(){
 		return (2*(length + width));
 	}

 	public static void main(String[] args) {
 		Rectangle r = new Rectangle(25,20);
 		System.out.println("Area = "+ r.area());
 		System.out.println("perimeter = " + r.perimeter());
 	}
 } 