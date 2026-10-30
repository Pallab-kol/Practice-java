interface A1{
    void meth1();
    void meth2();
}
interface B1 extends A1{
    void meth3();   //B1 holds all the methods of interface A1
}

class IFExtends implements B1 {
    public void meth1(){
        System.out.println("demo method version 1.");
    }
    public void meth2(){
        System.out.println("demo method version 2.");
    }
    public void meth3(){
        System.out.println("demo method version 3.");
    }
}

public class IFExtendsDemo{
    public static void main(String[] args) {
        IFExtends I = new IFExtends();

        I.meth1();
        I.meth2();
        I.meth3();
    }
}
