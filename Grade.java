package pack;
import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Maths: ");
        double value1 = sc.nextDouble();

        System.out.println("Enter the Marks of Physics: ");
        double value2 = sc.nextDouble();

        System.out.println("Enter the Marks of Chemistry: ");
        double value3 = sc.nextDouble();

        
        double a = value1 + value2 + value3;
        double avg = a / 3;

        System.out.println("Average: " + avg);

        String grade;
        if (avg > 90) {
            grade = "A";
        } else if (avg >= 80 && avg <= 90) {
            grade = "B";
        } else if (avg >= 70 && avg < 80) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade: " + grade);
    }
}