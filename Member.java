package jay_pr_1;

class Member {
    String name;
    int age;
    int phone_number;
    String address;
    double salary;

    public Member() {
        name = "John";
        age = 30;
        phone_number = 1234567890;
        address = "ahmedabad";
        salary = 50000;
    }

    public void printSalary() {
        System.out.println("The salary of " + name + " is " + salary);
    }
}