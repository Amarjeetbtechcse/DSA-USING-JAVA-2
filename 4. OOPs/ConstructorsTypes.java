public class ConstructorsTypes {
    public static void main(String[] args) {
        // Using the default constructor
        Student student1 = new Student();
        student1.display();

        // Using the parameterized constructor
        Student student2 = new Student("Alice", 101);
        student2.display();

        // Using the copy constructor
        Student student3 = new Student(student2);
        student3.display();
    }
}

class Student {
    String name;
    int roll;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.roll = 0;
    }

    // Parameterized constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Copy constructor
    Student(Student student) {
        this.name = student.name;
        this.roll = student.roll;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}