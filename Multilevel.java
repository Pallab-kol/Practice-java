class Vehicle{
    String brand;
    Vehicle(String b){
        brand = b;
    }
    void displayInfo(){
        System.out.println("Brand: " + brand);
    }
}
class car extends Vehicle{
    int SeatCap;
    car(String b, int s){
        super(b);
        SeatCap = s;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seating capacity: " + SeatCap);
    }
}
class EV extends car{
    double batteryCap;
    EV(String b, int s, double bc){
        super(b, s);
        batteryCap = bc;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCap + " KWh.");
    }
}

class MultiLevel {
    public static void main(String[] args){
        EV e1 = new EV("TATA Motors ltd.", 5, 100.0);
        e1.displayInfo();
    }
}
