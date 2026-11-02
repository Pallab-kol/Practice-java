package ExceptionHandling;
class ExcTest{
    static void genException(){
        int num[] = new int[4];
        System.out.println("Before exception geenerated.");
        //int v = num.length/0;
        num[7]=10;
        System.out.println("This wont be displayed");
    }
}
public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Index out of bound.");
        } catch(ArithmeticException a){
            System.out.println("Arithmetic exception.");
        }
        System.out.println("After try-catch block");
    }
}
