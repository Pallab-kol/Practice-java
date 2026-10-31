package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int [] num = new int[4];

        try {
            System.out.println("Before exception is generated.");
            num[3] = 10;
            System.out.println("This can't be generated.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("System out of bound.");
        }
        System.out.println("After catch.");
    }
}
