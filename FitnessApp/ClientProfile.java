package FitnessApp;
import java.util.Scanner;

public class ClientProfile {
    // VARIABLES
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    private double weight;
    private double maleBMR;
    private double femaleBMR;
    private double weightGoal;
    private double height;

    // CONSTRUCTOR
    public ClientProfile() {
        System.out.println("Enter your firstname");
        Scanner in = new Scanner(System.in);
        this.firstName = in.nextLine();
    
        System.out.println("Enter your lastname");
        this.lastName = in.nextLine();
        System.out.println("first name: " + firstName + "last name: " + lastName);

        //System.out.println("Enter your weight");
        //Scanner lb = new Scanner(System.in);
        //this.age = lb.nextInt();
        //System.out.println(" Enter your height");
        //Scanner h = new Scanner(System.in);
        //this.height = h.nextInt();


     }




    // LOOP FOR BMR BASED ON SEX OF INDIVIDUAL
    private int setBmr() 
    {
        if (this.sex == "male") {
        // bmr for men = 88.362+(13.397 x weight in kg) + (4.799 x height in cm ) - (5.677 x age)
        this.maleBMR = (88.362 + (13.397 * this.weight) + (4.799 * this.height) - (5.677 * this.age));
        } else {
        // BMR for woman: BMR = 447.593 + (9.247xweight in kg) + (3.098xheight in cm) - 4.330 x age)
        this.femaleBMR = (447.593 + (9.247 * this.weight) + (3.098 * this.height) - 4.330 * this.age);
        }


    }
    
    

}
