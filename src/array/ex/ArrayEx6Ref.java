package array.ex;

import java.util.Scanner;

public class ArrayEx6Ref {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 횟수를 정해주세요: ");
        int n = scanner.nextInt();
        int[] num = new int[n];


        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
        }
        int minNumber = num[0];
        int maxNumber = num[0];

        for(int i = 1; i < n; i++){
            if (num[i] < minNumber){
                minNumber = num[i];
            }
            if (num[i] > maxNumber){
                maxNumber = num[i];
            }
        }
        System.out.println("가장 적은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
