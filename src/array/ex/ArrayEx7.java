package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] sub = {"국어", "영어", "수학"};
        for (int row = 0; row < students.length; row++){
            int i = 0;
            System.out.println(row + 1 + "번 학생의 성적을 입력하세요: ");
            for (int column = 0; column < students[row].length; column++){
                System.out.print(sub[i] + " 점수: ");
                students[row][column] = scanner.nextInt();
                i++;
            }
        }
        for (int row = 0; row < students.length; row++){ //s[0][0], s[0][1], s[0][2], s[0][3]
            int sum = 0;
            double average = 0;
            
            for(int column = 0; column < students[row].length; column++){
                sum += students[row][column];
                average = sum / students[row].length;
            }
            System.out.println("===================================");
            System.out.println(row + 1 + "번 학생의 총점: " + sum);
            System.out.println(row + 1 + "번 학생의 평균: " + average);
        }
        System.out.println("===================================");
    }
}
