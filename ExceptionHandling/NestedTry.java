package ExceptionHandling;

//Nested try-catch block

public class NestedTry {
    public static void main(String[] args) {
        int num[] = {25, 6, 10, 20, 40, 56};
        int den[] = {2, 0, 4, 6, 0, 7, 0 , 5, 8};
        try {
            for (int i = 0; i < den.length; i++) {
                try {
                    System.out.println(num[i] + " / " + den[i] + " = " + num[i]/den[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Can't be divided by zero.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Numerator out of bound.");
            System.out.println("Code is terminated.");
        }
    }
}
