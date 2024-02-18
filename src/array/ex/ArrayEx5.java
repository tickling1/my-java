package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 횟수를 정해주세요: ");
        int count = scanner.nextInt();
        int sum = 0;
        int[] num = new int[count];
        System.out.println(count + "개의 정수를 입력하세요: ");

        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        double average = (double) sum / num.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
