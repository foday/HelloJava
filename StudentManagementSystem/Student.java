package StudentManagementSystem;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int StudentID;
    private String courses;
    private int tutionBalance;
    private int costOFCourse = 600;
    
    // Constructors - prompts students to enter name and year 
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class Level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);

    }
    
    // Generate an ID

    // Enroll in Courses

    //Pay Tuition

    //Show status 
}
