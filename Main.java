import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Emma", "Jones", new Date(), "Green", 3.9, 2024);

        System.out.println( s.getDOB() );
    }
}
