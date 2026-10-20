//generate a series of number


public interface series {
    int getnext();  //retuen the next number of series
    void reset();   //restart
    void setStart(int x);   //set the initial value of series
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
class ByThrees implements series{
    int start;
    int val;
    ByThrees(){
        start = 0;
        val = 0;
    }
    public int getnext(){
        val+=3;
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
        ByThrees b3 = new ByThrees();
        /*for(int i = 0; i < 5; i++){
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
        System.out.println();
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is: " + b3.getnext());
        }
        System.out.println();
        System.out.println("After performing reset();");
        b3.reset();
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is: " + b3.getnext());
        }
        System.out.println();
        System.out.println("setting value of b as 100.");
        b3.setStart(100);
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is: " + b3.getnext());
        }*/
       series iref;
       for(int i = 0; i < 5; i++){
            iref = b;
            System.out.println("Next b2 value is: " + b.getnext());
            iref = b3;
            System.out.println("Next b3 value is: " + b3.getnext());
        }
    }
}
