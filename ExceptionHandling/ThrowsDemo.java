package ExceptionHandling;

class ThrowsDemo {
    public static char Prompt(String str) throws java.io.IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }
    public static void main(String[] args) {
        char ch;

        try {
            ch = Prompt("Enter a letter");
        } catch (java.io.IOException e) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}
