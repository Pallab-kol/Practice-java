package java_oops.PackageA;
import PackageDemo.mypack.*;

class Sample extends ClassX1{
    protected String FName;
    protected String LName;
    public Sample(String f, String l){
        FName=f;
        LName=l;
    }
    public void showName(){
        System.out.println("Owner name is: ");
        System.out.println(FName + " " + LName);
    }
}
public class PackDemo {
    public static void main(String[] args) {
        ClassX1 c = new ClassX1();
        Sample s = new Sample("Pallab", "Saha");
        c.show();
        s.showName();
        System.out.println(c.math(7, 8));
    }
}
