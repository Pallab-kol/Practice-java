package ExceptionHandling;

class InvalidAgeException extends Exception{    //InvalidAgeException is a checked exception
    public InvalidAgeException(String m){
        super(m);
    }
}

public class CEdemo {
    public static void validate(int age) throws InvalidAgeException{    //The validate() method throws the exception if age is invalid
        if (age<18) {
            throw new InvalidAgeException("Underage can not be registered.");
        } else {
            System.out.println("Valid age: " + age);
        }
    } 
    public static void main(String[] args) {    //The exception must be handled in the main() method
        try {
            CEdemo.validate(19);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}