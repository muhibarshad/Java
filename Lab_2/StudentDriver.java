import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private String email;
    private String address;

    Student() {
        rollno = 0;
        name = email = address = "";
    }

    Student(int rollno, String name, String email, String address) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    Student(Student obj) {
        rollno = obj.rollno;
        name = obj.name;
        email = obj.email;
        address = obj.address;
    }

    void setRollNo(int rollNo) {
        this.rollno = rollNo;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setAddress(String address) {
        this.address = address;
    }

    int getRollNo() {
        return rollno;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    String getAddress() {
        return address;
    }

    void showData() {
        System.out.println("Roll No = " + rollno);
        System.out.println("Name = " + name);
        System.out.println("Email = " + email);
        System.out.println("Address = " + address);
    }

    void inputData() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Roll no : ");
        rollno = obj.nextInt();
        obj.nextLine();
        System.out.print("Enter name : ");
        name = obj.nextLine();
        System.out.print("Enter email : ");
        email = obj.nextLine();
        System.out.print("Enter address : ");
        address = obj.nextLine();
    }

}

public class StudentDriver {
    public static void main(String[] args) {
        int size = 2;
        Student stArr[] = new Student[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter the Student  " + (i + 1) + " info ");
            stArr[i] = new Student();
            stArr[i].inputData();
            i++;
        }
        i = 0;
        while (i < size) {
            System.out.println("The Student  " + (i + 1) + " info  : ");
            stArr[i].showData();
            i++;
        }
    }
}