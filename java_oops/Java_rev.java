/*class employee{
    private int salary;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setName(String n){
        name = n;
    }
    void setSalary(int s){
        salary = s;
    }
}*/
class rectangle{
    int length;
    int breath;
    int getLength(){
        return length;
    }
    int getBreath(){
        return  breath;
    }
    void setLength(int l){
        length = l;
    }
    void setBreath(int b){
        breath = b;
    }
    int areaR(){
        return length*breath;
    }
    int perimeter(){
        return 2*(length + breath);
    }
}
class circle{
    private float rad;
    float getRadius(){
        return rad;
    }
    void setRadius(float r){
        rad = r;
    }
    float areaC(){
        return 3.14f*getRadius()*getRadius();
    }
    float periC(){
        return 2.0f*3.14f*getRadius();
    }
}
class Java_rev {
    public static void main(String[] args){
        //System.out.println("hello world");
        //employee e = new employee();
        //e.setName("Pallab Saha");
        //e.setSalary(50000);
        //System.out.println("Name of employee is: " + e.getName());
        //System.out.println("Salary of employee is:" + e.getSalary());
        /*rectangle r = new rectangle();
        r.setBreath(12);
        r.setLength(18);
        System.out.println("Length of rectangle: " + r.getLength());
        System.out.println("Breadth of rectangle: " + r.getBreath());
        System.out.println("area of rectangle:" + r.areaR());
        System.out.println("perimeter of rectangle: " + r.perimeter());*/
        circle c = new  circle();
        c.setRadius(5.38f);
        System.out.println(c.areaC());
        System.out.println(c.periC());
    }
}

