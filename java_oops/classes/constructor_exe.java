class A{
    A(){
        System.out.println("COnstructing class A.");
    }
}
class B extends  A{
    B(){
        System.out.println("Constructing class B.");
    }
}
class C extends  B{
    C(){
        System.out.println("COnstructing class C.");
    }
}

class constructor_exe {
    public static void main(String[] args){
        C c = new C();
    }
}
