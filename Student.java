package pack;
import java.util.Scanner;

class Student1 {
    String name;
    int id;
    int age;
    String mobileNo;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter mobile number: ");
        mobileNo = sc.next();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.getData();
        student.display();
    }
}
