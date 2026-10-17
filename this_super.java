class Class{
    int A;
    int getA(){
        return A;
    }
    Class(int A){
        this.A = A;
    }
}

public class this_super {
    public static void main(String [] args){
        Class c = new Class(7);
        System.out.println(c.getA());
    }
}
