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
public class IfDemo {

    public static void main(String Arguments[]) {
        double Students;
        Students = 13;

        double Averagescores;
        Averagescores = 99.1;

        String op;
        op = "multiply";

        if (op.equals("add")) {
            double sum = Students + Averagescores;
            System.out.println("The number students plus the average score of all of them is " + sum);

        } else if (op.equals("subtract")) {
            double difference = Students - Averagescores;
            System.out.println("The difference between the students and their averagescores is " + difference);

        } else if (op.equals("multiply")) {
            double multiply = Students * Averagescores;
            System.out.println("The product of the students and their average scores is " + multiply);
            if (multiply > 100) {
                System.out.println("multiply > 100");
            } else {
                System.out.println("multiply < 100");
            }
        }
    }
}
