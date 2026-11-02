package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int [] num = new int[4];
        try {
            System.out.println("Before exception is generated.");
            int v = num.length / 0;     //try-catch follows first come first serve rule
            System.out.println(v);
            num[9] = 10;
            System.out.println("This can't be generated.");
        } catch (ArrayIndexOutOfBoundsException e) {    //here ExceptionType == ArrayIndexOutOfBoundException with its object e
            System.out.println("System out of bound.");     //Handler code for exception
        } catch(ArithmeticException a){
            System.out.println("Arithmetic exception occured.");
        }
        /*try{
            int v = num.length / 0;
            System.out.println(v);
        }catch (ArithmeticException a) {   //exception type Arithmetic Exception which does not matches curerent one hence
            System.out.println("Arithmetic exception occured.");    //won't be executed
        }*/
        System.out.println("After catch.");
    }
}
