package ExceptionHandling;

//Multiple try-catch block

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int num[] = {25, 6, 10, 20, 40, 56};
        int den[] = {2, 0, 4, 6, 0, 7, 0 , 5, 8};

        for (int i = 0; i < den.length; i++) {  //using fori loop iterating each index and to use the try-catch block multiple time
            try {
                System.out.println(num[i] + " / " + den[i] + " = " + num[i]/den[i]);
            } catch (ArithmeticException e) {   //returns error message when arithmetic exception happens
                System.out.println("Can't divide by zero.");
            } catch (ArrayIndexOutOfBoundsException a){     // returns out of bound error when threshold is happened
                System.out.println("Numerator out of bound.");
            }
        }
    }
}
