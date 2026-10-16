class person{
    private String first_name;
    private String last_name;
    private String DOB;
    person(String f, String l, String d){
        first_name = f;
        last_name = l;
        DOB = d;
    }
    public String getDOB() {
        return DOB;
    }
    public String getFirst_name() {
        return first_name;
    }public String getLast_name() {
        return last_name;
    }
    public void setDOB(String dOB) {
        DOB = dOB;
    }
    public void setFirst_name(String f) {
        first_name = f;
    }public void setLast_name(String l) {
        last_name = l;
    }
    void showInfo(){
        System.out.println("Person's info: ");
        System.out.println("Name: " + getFirst_name() + " " + getLast_name());
        System.out.println("Date of birth: " + getDOB());
    }
}
class CollegeGraduate extends person{
    private float GPA;
    int YOP;
    CollegeGraduate(String f, String l, String dOB, float g, int y){
        super(f, l , dOB);
        GPA = g;
        YOP = y;
    }
    public float getGPA() {
        return GPA;
    }
    public int getYOP() {
        return YOP;
    }
    public void setGPA(float gPA) {
        GPA = gPA;
    }
    public void setYOP(int yOP) {
        YOP = yOP;
    }
    void showInfo(){
        super.showInfo();
        System.out.println("Final GPA: " + getGPA());
        System.out.println("Year of graduation: " + getYOP());
    }
}

class Student {
    public static void main(String [] args){
        CollegeGraduate c = new CollegeGraduate("Pallab", "Saha", "23-02-2005", 4.67f, 2027);
        c.showInfo();
    }    
}
