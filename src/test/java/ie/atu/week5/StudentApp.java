package ie.atu.week5;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("please enter your name: ");
        Scanner input = new Scanner(System.in);
        double name = input.nextDouble();
        StudentInfo StudInfo = new StudentInfo();
        System.out.println("You entered :"+ name);
        StudInfo.setName(name);



        System.out.println("please enter your name: ");
        double email = input.nextDouble();
        System.out.println("You entered :"+ email);
        StudInfo.setEmail(email);

        System.out.println("please enter your name: ");
        double course = input.nextDouble();
        System.out.println("You entered :"+ course);
        StudInfo.setCourse(course);
    }

}
