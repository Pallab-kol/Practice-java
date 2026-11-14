package ExceptionHandling;

class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String m){
        super(m);
    }
}

public class UCEDemo {
    public static void divide(int num, int den){
        if(den == 0){
            throw new DivideByZeroException("Can not be divide by zero.");
        } else{
            System.out.println("Division result: " + (num/den));
        }
    }
    public static void main(String[] args) {
        try {
            UCEDemo.divide(12, 0);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            UCEDemo.divide(12, 3);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
