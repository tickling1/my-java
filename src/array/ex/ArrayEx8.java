package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int count = scanner.nextInt(); //학생 수

        System.out.print("입력해야 하는 과목수를 적어주세요: ");
        int subCount = scanner.nextInt(); //과목 수
        scanner.nextLine();
        
        int[][] students = new int[count][subCount]; // 2차원 배열선언, 초기화
        
        String[] sub = new String[subCount]; // 문자열 (학생수 만큼) 배열 선언, 초기화,

        for (int i = 0; i < subCount; i++) { //과목명을 적고 sub 문자열배열에 초기화
            System.out.print("과목을 적어주세요: ");
            sub[i] = scanner.nextLine();
        }

        for (int row = 0; row < students.length; row++){ 
            int i = 0;
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요: "); // (0+1) ~ 학생수 만큼 출력
            for (int column = 0; column < students[row].length; column++){
                System.out.print(sub[i] + " 점수: "); // 과목명 배열 0 ~ 반복될 때 까지 i++ 하면서 입력창 출력
                students[row][column] = scanner.nextInt(); // student[0][0] ~ student[count][subcount] 까지 초기화
                i++;
            }
        }

        for (int row = 0; row < students.length; row++){ //입력한 학생 점수 합 출력부분
            int sum = 0;
            double average = 0;
            int min = students[0][0];
            int max = students[0][0];

            for(int column = 0; column < students[row].length; column++){
                sum += students[row][column];
                average = sum / students[row].length;

                if (min > students[row][column]){
                    min = students[row][column];
                }
                if (max < students[row][column]){
                    max = students[row][column];
                }
            }

            System.out.println("===================================");
            System.out.println((row + 1) + "번 학생의 총점: " + sum);
            System.out.println((row + 1) + "번 학생의 평균: " + average);
            System.out.println((row + 1) + "번 최저 점수: " + min);
            System.out.println((row + 1) + "번 최고 점수: " + max);
        }
        System.out.println("===================================");
    }
}
