interface IFA{
    void DoSomething();
}
interface IFB{
    void doSomethingElse();
}

class MyClass implements IFA, IFB{
    public void DoSomething(){
        System.out.println("Doing something");
    }
    public void doSomethingElse(){
        System.out.println("Doing something else...");
    }
}

class Interfacing {
    public static void main(String[] args){
        IFA aref;
        IFB bref;
        MyClass M = new MyClass();
        aref = M;
        aref.DoSomething();
        bref=M;
        bref.doSomethingElse();
    }
}
