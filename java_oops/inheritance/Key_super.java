class TwoDShape{
    private double height;
    private double width;
    //adding superclass constructor
    TwoDShape(double h, double w){
        height = h;
        width = w;
    }
    double getHeight(){return height;}
    double getWidth(){return width;}
    void setHeight(double h){
        height = h;
    }
    void setWidth(double w){
        width = w;
    }
    void ShowDim(){
        System.out.println("Dimensions of the shape are: " + height + " and " + width);
    }
}
class Triangle extends TwoDShape{
    private String style;
    Triangle(String s, double w, double h){
        super(h,w);     //calling the constructor from superclass TwoDShape
        style = s;
    }
    double Area(){
        return  getHeight() * getWidth() * 0.5;
    }
    void ShowStyle(){
        System.out.println("Triangle is: " + style);
    }
}

class Key_super{
    public  static  void main(String[] args){
        Triangle t1 = new Triangle("Filled", 12.3, 3.67);
        Triangle t2 = new Triangle("Outlined", 6.92, 5.0);
        System.out.println("Info of Triangle t1: ");
        t1.ShowDim();
        System.out.println("Area of triangle is: " + t1.Area());
        t1.ShowStyle();
        System.out.println();
        System.out.println("Info of Triangle t2: ");
        t2.ShowDim();
        System.out.println("Area of triangle is: " + t2.Area());
        t2.ShowStyle();
    }
}