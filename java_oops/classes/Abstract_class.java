abstract class animal{  //this class cant be used directly
    String name;
    animal(String n){
        name = n;
    }
    abstract void makeSound();
    void Eat(){
        System.out.println("It is eating...");
    }
}
class cat extends animal{   //using this class to access all the propertiees of the super class
    cat(String n){
        super(n);
    }
    @Override 
    void makeSound(){
        System.out.println(name + " says: Surrender or Fight!...");
    }
}

public class Abstract_class {
    public static void main(String[] args){
        cat c = new  cat("Meowth");
        System.out.println("name of cat is: "+c.name);
        c.makeSound();
        c.Eat();
    }
}
