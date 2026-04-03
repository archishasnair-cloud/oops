package oops_practice;
import java.util.Scanner;
class Student{
	// Instance-level attributes (belongs to each object)
	private String name;
	private int marks;
	private char grade;
	private int rollNo;
	
	// Class-level attribute (shared by all objects)
    static int studentCount = 0;
    
    //constructor
    public Student() {
    	studentCount++;
    	}
    //method to read data into object
    public void readData() {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter the student name");
    	name = sc.nextLine();
    	
    	System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks: ");
        int inputMarks = sc.nextInt();
        
        if(inputMarks>=0 && inputMarks<=100) {
        	marks = inputMarks;
        }
        else {
        	System.out.println("Invalid marks entered. Setting marks to 0.");
            marks = 0;
        }

    }
    //method to calculate grade
    public void calculateGrade() {
    	if (marks>=90) {
    		grade='A';
    	}
    	else if(marks>=75) {
    		grade='B';
    	}
    	else if(marks>=50) {
    		grade='C';
    	}
    	else {
    		grade='F';
    	}
    }
    
    //method to display object data
    public void writeData() {
    	System.out.println("\n--- Student Report Card ---");
    	System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Marks  : " + marks);
        System.out.println("Grade  : " + grade);
    }
    public static void showStudentCount() {
    	System.out.println("\nTotal Student Objects Created: " + studentCount);
    }
    }
public class prac {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2 = new Student();
		
		System.out.println("Enter details for Student 1");
        s1.readData();
        s1.calculateGrade();
        
        System.out.println("\nEnter details for Student 2");
        s2.readData();
        s2.calculateGrade();

        s1.writeData();
        s2.writeData();

        Student.showStudentCount();

	}

}
