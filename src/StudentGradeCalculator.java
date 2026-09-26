import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for DISCRETE MATHS: ");
        int discrete_maths = sc.nextInt();

        System.out.print("Enter marks for JAVA: ");
        int java = sc.nextInt();

        System.out.print("Enter marks for DBMS: ");
        int dbms = sc.nextInt();

        System.out.print("Enter marks for OS: ");
        int os = sc.nextInt();

        System.out.print("Enter marks for AI: ");
        int ai = sc.nextInt();

        int total = discrete_maths + java + dbms + os + ai;

        double percentage = total/5.0;

        char grade;

        if(percentage >= 90){
            grade = 'A';
        }
        else if(percentage >= 80){
            grade = 'B';
        }
        else if(percentage >= 70){
            grade = 'C';
        }
        else if(percentage >= 60){
            grade = 'A';
        }
        else if(percentage <= 50){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("\n**---------RESULT FOR SEMESTER IV---------**");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + percentage);
        System.out.println("Grade: " + grade);


    }
}
