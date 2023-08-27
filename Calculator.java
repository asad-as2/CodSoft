// Task 2 : STUDENT GRADE CALCULATOR

import java.util.Scanner;
public class Calculatotr{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of subjects: ");
    int n = sc.nextInt();
    int marks[] = new int[n];
    int totalMarks = 0;

    System.out.println("Enter the marks obtained in each subject (out of 100): ");

    for(int i = 0; i < n; i++)
      {
        marks[i] = sc.nextInt();
        totalMarks += marks[i];
      }
    double averagePercentage = (double) totalMarks / n;

    char grade;
    if (averagePercentage >= 90) {
      grade = 'A';
    }  else if (averagePercentage >= 80) {
      grade = 'B';
    }  else if (averagePercentage >= 70) {
      grade = 'C';
    }  else if (averagePercentage >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + averagePercentage);
    System.out.println("Grade: " + grade);
  }
}
