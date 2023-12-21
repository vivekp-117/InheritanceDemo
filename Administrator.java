import java.util.Date;

public class Administrator extends Person{
    private int officeNum;
    

    public Administrator(String firstName, String lastName, Date DOB, String hairColor, int officeNum) {
        super(firstName, lastName, DOB, hairColor);
        this.officeNum = officeNum;
    }

    public int getOfficeNum() {
        return officeNum;
    }

}
