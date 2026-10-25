import java.util.Scanner;
class Complex{
	private double real, img;
	void getdata(){
		Scanner sc = new Scanner(System.in);
		real = sc.nextDouble();
		img = sc.nextDouble();
		System.out.println("DEBUG: Read values as: " + real + "and " + img);
	}
	Complex Sum(Complex ob1, Complex ob2){
		Complex temp = new Complex();
		temp.real = ob1.real + ob2.real;
		temp.img = ob1.img + ob2.img;
		System.out.println("DEBUG: After sun value of temp.real: " + temp.real);
		return temp;
	}
	/*void Show(){
	    // %.3f limits the output to exactly 3 decimal places
	    System.out.printf("Sum of complex numbers: %.3f +j %.3f\n", real, img);
	}*/
	void Show(){
		System.out.println("Sum of complex numbers: " + real + " +j " + img);
	}
}

class ComplexSum{
	public static void main(String[] args){
		Complex ob1 = new Complex();
		Complex ob2 = new Complex();
		Complex ob3 = new Complex();
		System.out.println("Enter real and imaginary part of 1st complex number: ");
		ob1.getdata();
		System.out.println("Enter real and imaginary part of 2nd complex number: ");
		ob2.getdata();
		ob3 = ob1.Sum(ob1, ob2);
		ob3.Show();
	}
}
