package ie.atu.week5;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // created first instance of Studinfo
        System.out.println("please enter your name: ");
        Scanner input = new Scanner(System.in);
        double name = input.nextDouble();
        StudentInfo StudInfo = new StudentInfo();
        StudInfo.setName(name);
        System.out.println("You entered :"+ StudInfo.getName());


        System.out.println("please enter your email: ");
        double email = input.nextDouble();
        System.out.println("You entered :"+ StudInfo.getEmail());
        StudInfo.setEmail(email);

        System.out.println("please enter your course name: ");
        double course = input.nextDouble();
        System.out.println("You entered :"+ StudInfo.getCourse());
        StudInfo.setCourse(course);
/*///////////////////////////////////////////////////////////////////////*/
        // created second instance of Studinfo
        System.out.println("please enter another name: ");
        double name2 = input.nextDouble();
        StudentInfo StudInfo2 = new StudentInfo();
        StudInfo2.setName(name2);
        System.out.println("You entered :"+ StudInfo2.getName());


        System.out.println("please enter another email: ");
        double email2 = input.nextDouble();
        System.out.println("You entered :"+ StudInfo2.getEmail());
        StudInfo.setEmail(email2);

        System.out.println("please enter the course name: ");
        double course2 = input.nextDouble();
        System.out.println("You entered :"+ StudInfo2.getCourse());
        StudInfo.setCourse(course2);
    }

}
