package test_20222023;

import java.util.Scanner;

class Student {
    double score;

    Student(double currentStd){
        this.score = currentStd;
    }
}

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numStd = 0;
        double score = 0, totalScore = 0, highestScore = 0;

        System.out.print("Enter number of student : ");
        numStd = input.nextInt();

        Student[] arrStd = new Student[numStd];

        for (int i = 0; i < numStd; i++) {
            System.out.print("Enter mark for student " + (i+1) + " : ");
            score = input.nextDouble();
            arrStd[i] = new Student(score);

            totalScore += arrStd[i].score;

            if (arrStd[i].score > highestScore) {
                highestScore = score;
            }
        }

        System.out.println("Average score : " + (totalScore / numStd));
        System.out.println("Highest score : " + highestScore);
    }
}