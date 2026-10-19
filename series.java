//generate a series of number


public interface series {
    int getnext();
    void reset();
    void setStart(int x);
}
class ByTwos implements series{
    int start;
    int val;

    ByTwos(){
        start = 0;
        val = 0;
    }
    public int getnext(){
        val+=2;
        return val;
    }
    public void reset(){
        val = start;
    }
    public void setStart(int x){
        start = x;
        val = x;
    }
}

class Interface_ {
    public static void main(String[] args){
        ByTwos b = new ByTwos();
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is: " + b.getnext());
        }
        System.out.println();
        System.out.println("After performing reset();");
        b.reset();
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is: " + b.getnext());
        }
        System.out.println();
        System.out.println("setting value of b as 100.");
        b.setStart(100);
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is: " + b.getnext());
        }
    }
}
