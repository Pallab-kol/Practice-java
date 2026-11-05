package ExceptionHandling;

class UseFinallyDemo {
    public static void genException(int what){
        int t;
        int [] num = new int[2];

        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    num[4] = 4;
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't divided by zero.");
            //return;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No matching element found.");
        } finally{
            System.out.println("Leaving try.");
        }
    }
}


public class UseFinally {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinallyDemo.genException(i);
            System.out.println();
        }
    }
}