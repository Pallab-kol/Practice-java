class employeeA{
    private int id;
    private String name;
    private float salary;
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    float getSalary(){
        return salary;
    }
    employeeA(){    //constructor without argument
        id = 5;
        name = "Pallab Saha";
        salary = 56000.0000f;
    }
    employeeA(int i, String n, float s){     //constructor with argument(a type of overloading)
        id = i;
        name = n;
        salary = s;
    }
}

public class const_prac {
    public static void main(String[] args){
        employeeA e1 = new employeeA();
        employeeA e2 = new employeeA(9, "Sahil Verma", 34500.358f);
        System.out.println("Employee id for e1: "+e1.getId());
        System.out.println("Employee name for e1: "+ e1.getName());
        System.out.println("Employee salary is: " + e1.getSalary());
        System.out.println("Employee id for e2: "+e2.getId());
        System.out.println("Employee name for e2: "+ e2.getName());
        System.out.println("Employee salary is: " + e2.getSalary());
    }
}
