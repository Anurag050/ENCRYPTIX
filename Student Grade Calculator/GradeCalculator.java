import java.util.Scanner;

public class GradeCalculator {
    //Function
    public static void StudentGradeCalculator(){
        try (Scanner scn = new Scanner(System.in)) {
            //variables used in this program
            String name;
            char grade;
            int subject;
            float Total = 0 ,average;

            //Name of the Student
            System.out.print("Enter the name of the student : ");
            name = scn.nextLine();

            //Total number of the Subject
            System.out.print("Enter the number of the subjects: ");
            subject = scn.nextInt();

            //It counts the number of the subject
            for(int i=1;i<=subject;i++){
                //print the score for each subject
                System.out.print("Enter the marks of " + i + " subject: ");
                double mark = scn.nextDouble();
                Total+=mark;
            }

            //Calculating the average mark of the student
            average = (Total/subject);

            //Now calculate the grade on the basis of marks
            if(average>=90){
                grade = 'A';
            }else if(average>=80){
                grade = 'B';
            }else if(average>=70){
                grade = 'C';
            }else if(average>=60){
                grade = 'D';
            }else if(average>=50){
                grade = 'E';
            }else{
                grade = 'F';
            }
            System.out.println();//This is used to giving space in between both of them.
            //Display the result of the student 
            System.out.println("--------Result--------");
            System.out.println();
            System.out.println("Name of the Student: " + name);
            System.out.println("Total marks of the Student: " + Total);
            System.out.println("Average percentage of the Student: " + average +"%");
            System.out.println("Grade of the Student: " + grade);
        }

        System.out.println("---------Thank You!---------");
    }

    //Driver call
    public static void main(String[] args) {
        //Function call
       StudentGradeCalculator();
    }
}

