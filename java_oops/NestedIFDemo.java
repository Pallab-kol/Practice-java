interface A2{
    public interface NestedIF1{
        boolean isNotNegative(int x);
    }
    void Print();
}

class NestedIF implements A2.NestedIF1 {
    public boolean isNotNegative(int x){
        return x < 0 ? false:true;
    }
}
class NestedIFDemo{
    public static void main(String[] args) {
        A2.NestedIF1 n = new NestedIF();
        if (n.isNotNegative(20)) {
            System.out.println("20 is not negative.");
        }
        if (n.isNotNegative(-10)) {
            System.out.println("it won't be displayed");
        }
    }
}