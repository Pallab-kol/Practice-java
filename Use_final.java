final class A1{
    final void meth(){
        System.out.println("this is a final method");
    }
}
class B1{ 
    void meth1(){
        System.out.println("Illegal");
    }
}

class Use_final {
    public static void main(String [] args){
        A1 a = new A1();
        B1 b = new B1();
        a.meth();
        b.meth1();
    }
}
