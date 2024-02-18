package array.ex;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력해주세요: ");
        int students = scanner.nextInt();
        int count = 1;
        int sum = 0;
        int[] score = new int[students];

        System.out.println("시험점수를 입력하시오: ");

        for (int i = 0; i < score.length; i++){
            score[i] = scanner.nextInt();
            sum += score[i];
        }

        System.out.println("입력한 점수는: ");

        for (int i = 0; i < score.length; i++){
            System.out.print(score[i]);
            if (count < score.length){
                System.out.print(", ");
            }
            count++;
        }
        System.out.println();
        System.out.println("총 점수: " + sum);
        System.out.println("점수 평균: " + (double) sum / score.length);
    }
}
