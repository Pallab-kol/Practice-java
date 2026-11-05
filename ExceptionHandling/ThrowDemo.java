package ExceptionHandling;

class Rethrow{
    public static void genException() {
    int [] num = {8, 6, 9, 12, 16, 34};
    int [] den = {2, 4, 9, 8};

    //using try-catch block
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + den[i] + " = " + num[i]/den[i]);
            } catch (ArithmeticException e) {
                System.out.println("Can't be divided by zero.");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index can't be found.");    //technically the try-catch exterminated here
                //rethrowing the exception
                throw e;
            }
        }
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
          try {     //this try-catch is recatching the thrown e into it and executing one last time with message in catch
            Rethrow.genException();
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fatal error - session terminated.");
          }
    }
}
