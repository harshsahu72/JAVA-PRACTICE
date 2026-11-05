//create a student class
//store name,roll no and marks in 3 subject
// calculate total and percentage display  pss or fail with student details
//save student details in a text file .



package Studentclassnov5;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Student {

    String name;
    int rollNo;
    int m1, m2, m3;
    int total;
    double percentage;
    String result;

    // Constructor
    Student(String name, int rollNo, int m1, int m2, int m3) {
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Calculate total and percentage
    void calculate() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;

        if (m1 >= 33 && m2 >= 33 && m3 >= 33) {
            result = "PASS";
        } else {
            result = "FAIL";
        }
    }

    // Display student details
    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }

    // Save details in text file
    void saveFile() {
        try {
            FileWriter fw = new FileWriter("student.txt", true);

            fw.write("Name: " + name + "\n");
            fw.write("Roll No: " + rollNo + "\n");
            fw.write("Marks: " + m1 + ", " + m2 + ", " + m3 + "\n");
            fw.write("Total: " + total + "\n");
            fw.write("Percentage: " + percentage + "%\n");
            fw.write("Result: " + result + "\n");
            fw.write("------------------------\n");

            fw.close();

            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}

public class Studentclassnov5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, rollNo, m1, m2, m3);

        s.calculate();
        s.display();
        s.saveFile();

        sc.close();
    }
}
