package StudentManagementSystem;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1001;
    
    
    // Constructors - prompts students to enter name and year 
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class Level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

        setStudentID();

    }
    
    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + id;

    }

    // Enroll in Courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (course != "Q") {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
        }
        else { 
            System.out.println("BREAK!");
            break;
        }
    } while (1 != 0);
    
    System.out.println("ENROLLED IN: " + courses);
    System.out.println("TUITION BALANCE: " + tuitionBalance);

}

    // Pay Tuition

    
    //Show status 
}
