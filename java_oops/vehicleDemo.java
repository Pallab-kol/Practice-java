class vehicle1{
    private double mpg;
    private double fuelcap;
    private int passenger;
    vehicle1(double m, double f, int p){
        mpg = m;
        fuelcap = f;
        passenger = p;
    } 
    double range(){
        return  mpg * fuelcap;
    }
    double fuelneeded(double miles){
        return miles / mpg;
    }
    double getMpg(){ return  mpg; }
    void setMpg(double m){
        mpg = m;
    }
    double getFuel(){ return  fuelcap; }
    void setFuel(double f){
        fuelcap = f;
    }
    int getPassenger(){ return passenger; }
    void setPassenger(int p){
        passenger = p;
    }
}
class TruckDemo extends vehicle1{
    private int cargocap;
    TruckDemo(double m, double f, int p, int c){
        super(m, f, p);
        cargocap = c;
    }
    int getCargocap(){ return cargocap; }
    void setCargocap(int c){
        cargocap = c;
    }
    void TypeTruck(){
        if(getCargocap()>2500){
            System.out.println("It is a semi-truck.");
        } else{
            System.out.println("It is a pickup truck.");
        }
    }
}
class vehicleDemo {
    public static void main(String [] args){
        TruckDemo T1 = new  TruckDemo(5, 40, 6, 1500);
        //TruckDemo t2 = new TruckDemo(6, 30, 4, 2000);
        double miles = 400;
        double gallon;
        gallon = T1.fuelneeded(miles);
        System.out.println("it can carry "+ T1.getCargocap() + "Kg. ");
        T1.TypeTruck();
        System.out.println("Fuel required: "+gallon+" gallons");
        System.out.println("number of passengers: "+ T1.getPassenger());
    }
}
