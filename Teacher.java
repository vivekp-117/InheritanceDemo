import java.util.Date;

public class Teacher {
    private String firstName;
    private String lastName;
    private Date DOB;
    private Date hireDate;
    private double salary;

    public Teacher(String firstName, String lastName, Date DOB, Date hireDate, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
