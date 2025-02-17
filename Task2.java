//This program calculates the average marks and grade of a student for 5 Subjects.

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int i=0;
	
        System.out.println("---Enter the marks out of 100---");
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks for Subject 4: ");
        int subject4 = scanner.nextInt();
        System.out.print("Enter marks for Subject 5: ");
        int subject5 = scanner.nextInt();
        
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
	if((subject1<=100) && (subject2<=100) && (subject3<=100) && (subject4<=100) && (subject5<=100)){        
        double averagePercentage = (totalMarks / 5.0);
        i += 1;
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("\nTotal Marks: " + totalMarks + " / 500");
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        }
	if(i==0){
	System.out.println("---Sorry you entered marks in a wrong way. Ensure you give marks out of 100---");}
        scanner.close();
    }
}

