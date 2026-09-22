class Area{
	//code of method overloading
	//area of circle
	double area(double a){		//area of circle
		return 3.14 * a * a;
	}
	double area(double a, double b){	//area of rectangle
		return a * b;
	}
	double area(float a){	//area of square
		return a * a;
	}
}
 class Shape{
 	public static void main(String[] args){
 		Area sh1 = new Area();
 		Area sh2 = new Area();
 		Area sh3 = new Area();
 		System.out.println("Area of circle is: " + sh1.area(2.567));
 		System.out.println("Area of square is: " + sh2.area(2.567f));
 		System.out.println("Area of rectangle is: " + sh3.area(2.567, 3.564));
 	}
 }
