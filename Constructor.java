class TwoDShape1{
    private double height;
    private double width;
    double getHeight(){ return height; }
    double getWidth(){ return width; }
    void setHeight(double h){
        height = h;
    }
    void setWidth(double w){
        width = w;
    }
    void showDim(){
        System.out.println("Height and Width are: " + height + " and " + width);
    }
}

class triangle1 extends TwoDShape1{
    private String style;
    triangle1(String s, double h, double w){
        style = s;
        setHeight(h);
        setWidth(w);
    }
    double area(){
        return getHeight() * getWidth() * 0.5;
    }
    void ShowStyle(){
        System.out.println("Triangle is: " + style);
    }
}
class FourSide extends TwoDShape{
    FourSide(double h, double w){
        setHeight(h);
        setWidth(w);
    }
    double area4(){
        return getHeight()*getWidth();
    }
    void showType(){
        if(getHeight() == getWidth()){
            System.out.println("Type of four side is: Square");
        } else{
            System.out.println("Type of four side is: Rectangle");
        }
    }
}

class Constructor{
    public static void main(String[] args) {
        triangle1 t1 = new triangle1("Aligned", 11.8, 13.9);
        triangle1 t2 = new triangle1("Filled", 9.97, 6.67);
        FourSide f1 = new FourSide(23.76, 23.77);
        FourSide f2 = new FourSide(23.76, 23.76);
        System.out.println("Info of triangle t1: ");
        t1.showDim();
        System.out.println("Area of triangle t1: " + t1.area());
        t1.ShowStyle();
        System.out.println();

        System.out.println("Info of triangle t2: ");
        t2.showDim();
        System.out.println("Area of triangle t2: " + t2.area());
        t2.ShowStyle();

        System.out.println();
        System.out.println("info of f1:" );
        f1.showDim();
        System.out.println("Area of shape is: " + f1.area4());
        f1.showType();
        System.out.println();
        System.out.println("info of f2:" );
        f2.showDim();
        System.out.println("Area of shape is: " + f2.area4());
        f2.showType();
    }
}