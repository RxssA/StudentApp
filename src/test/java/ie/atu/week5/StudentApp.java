package ie.atu.week5;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("please enter your name: ");
        Scanner input = new Scanner(System.in);
        double name = input.nextDouble();
        System.out.println("You entered :"+ name);
    }
}
