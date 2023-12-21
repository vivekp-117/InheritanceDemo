import java.util.Date;

public class Teacher extends Person{
    private Date hireDate;
    private double salary;

    public Teacher(String firstName, String lastName, Date DOB, String hairColor, Date hireDate, double salary) {
        

        super(firstName, lastName, DOB, hairColor);
        this.hireDate = hireDate;
        this.salary = salary;
        if (salary < 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }


    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
    
}
