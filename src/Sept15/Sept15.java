package Sept15;

class Student {

    int id;
    String name;
    double totalMarks;

    Student() {
        id = 12509785;
        name = "Sakshi";
        totalMarks = 12.5;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.totalMarks = 652.;
    }

    Student(int id, String name, double totalMarks) {
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(12502797, "Harsh");

        Student s3 = new Student(125689, "Subham ", 450);

        s1.display();
        s2.display();
        s3.display();
    }
}