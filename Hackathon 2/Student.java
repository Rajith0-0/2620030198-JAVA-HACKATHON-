import java.util.Scanner;

class Student {
    
    String studentName;
    String rollNumber;
    int marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    public Student(String studentName, String rollNumber, int marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculate total course fee
    public double calculateFee() {
        return courseCredits * 1500;
    }

    
    public boolean checkEligibility() {
        return marks >= 50;
    }

    
    public double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85) {
            return fee * 0.20;
        } else if (marks >= 70 && marks <= 84) {
            return fee * 0.10;
        } else {
            return 0.0;
        }
    }

    
    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    // Display all student and course details
    public void displayDetails() {
        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        // Create Student object
        Student student = new Student(name, roll, marks, course, credits);

        // Check eligibility and process registration
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Failed: Student is not eligible (Marks are below 50).");
        }

        sc.close();
    }
}
