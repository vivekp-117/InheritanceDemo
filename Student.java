import java.util.Date;

public class Student extends Person{
    
    private double GPA;
    private int YOG;

    public Student(String firstName, String lastName, Date DOB, String hairColor, double GPA, int YOG) {
        super(firstName, lastName, DOB, hairColor);
        this.GPA = GPA;
        this.YOG = YOG;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYOG() {
        return YOG;
    }
    
    
}
