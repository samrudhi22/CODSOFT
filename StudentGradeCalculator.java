package com.solution.main;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        
        int Subjects = scanner.nextInt();

        int[] marks = new int[Subjects];
        int totalMarks = 0;
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double Percentage = (double) totalMarks / Subjects;
        char grade;
        if (Percentage >= 90) {
            grade = 'A';
        } else if (Percentage >= 80) {
            grade = 'B';
        } else if (Percentage >= 70) {
            grade = 'C';
        } else if (Percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n************------Student Result------************");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + Percentage + "%");
        System.out.println("--------------------------------");
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------------");
        
        scanner.close();
    }
}

