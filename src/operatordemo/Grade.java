/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatordemo;

/**
 *
 * @author Douglas
 */
public class Grade {

    public static void main(String Argument[]) {
        double score;
        score = 85;

        String grade;

        String comment;

        if (score > 90) {
            grade = "A";
            comment = "VERY GOOD!";
        } else if ((score > 80) && score < 90) {
            grade = "B";
            comment = "Good";
        } else if ((score > 70) && score < 80) {
            grade = "C";
            comment = "Proficient";
        } else if ((score > 60) && score < 70) {
            grade = "D";
            comment = "Bad work";
        } else {
            grade = "F";
            comment = "Horrible,Horrible work";

        }

        System.out.println("Tis Student's grade is " + grade
                + " and the number grade the student got is " + score
                + " and the teacher's comment is " + comment
        );

    }
}
