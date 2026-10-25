class sup{
    void who(){
        System.out.println("who() is inside sup." );
    }
}
class sub1 extends sup{
    void who(){
        System.out.println("who() is inside sub1." );
    }
}
class sub2 extends sup{
    void who(){
        System.out.println("who() is inside sub2." );
    }
} 
class polymorphism {  
    public static void main(String [ ] args){
        sup supob = new sup();
        sub1 sub1ob = new sub1();
        sub2 subob2 = new sub2();
        sup supref;
        supref = supob;
        supref.who();
        supref = sub1ob;
        supref.who();
        supref = subob2;
        supref.who();
    }    
}
