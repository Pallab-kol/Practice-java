package Threading;
class Plus extends Thread{
    private int a, b;
    Plus(int m, int n){
        a = m;
        b = n;
    }
    public void run(){      //Contains the code for the thread. Calling it directly behaves like a normal method call.
        System.out.println("Sum of a and b: " + (a+b));
    }
}
class Minus extends Thread{
    private int a, b;
    Minus(int m, int n){
        a = m;
        b = n;
    }
    public void run(){
        System.out.println("Subtraction of a and b: " + (a-b));
    }
}
class Mul extends Thread{
    private int a, b;
    Mul(int m, int n){
        a = m;
        b = n;
    }
    public void run(){
        System.out.println("Multiplication of a and b: " + (a*b));
    }
}
public class CalcThread {
    public static void main(String[] args) {
        Plus p = new Plus(156, 79);
        Minus m = new Minus(212, 119);
        Mul M = new Mul(145, 67);
        p.start();      // Launches a new thread and internally calls run() concurrently.
        m.start();
        M.start();
    }
}
