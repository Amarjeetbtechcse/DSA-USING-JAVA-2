public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "aktu college"; // schoolName set kiya s1 object se

        Student s2 = new Student();
        System.out.println(s2.schoolName); // schoolName print kiya s2 object se

        Student s3 = new Student();
        s3.schoolName = "ABC COLLEGE"; // schoolName set kiya s3 object se

        // Verifying the changes in the static variable
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name; 
    int roll;
    
    static String schoolName; // static variable

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
