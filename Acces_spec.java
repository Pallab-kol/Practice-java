class TwoDShape{
    private double width;   //private member and can't be used by other classes or other child classes
    private double height;
    double getHeight(){
        return height;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }
    void showDim(){
        System.out.println("Width and Height are: " + width + " and " + height);
    }
}

class Triangle extends TwoDShape{
    String style;
    double area(){
        return getHeight() * getWidth() * 0.5;  //for private access specifier the area() method is using the private memebrs through another public method of parent class
    }
    void ShowStyle(){
        System.out.println("Triangle is: " + style);
    }
}
class Access_spec{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setHeight(6.0);
        t1.setWidth(7.7);
        t1.style = "Filled";
        
        t2.setHeight(5.0);
        t2.setWidth(9.7);
        t2.style = "Outlined";
        System.out.println("Info of triangle t1: ");
        t1.ShowStyle();
        t1.showDim();
        System.out.println("Area of triangle t1: " + t1.area());
        System.out.println();
        System.out.println("Info of triangle t2: ");
        t2.ShowStyle();
        t2.showDim();
        System.out.println("Area of triangle t1: " + t2.area());
    }
}