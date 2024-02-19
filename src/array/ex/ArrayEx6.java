package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 횟수를 정해주세요: ");
        int count = scanner.nextInt();
        int[] num = new int[count];

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
                num[i] = scanner.nextInt();
        }
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++){
            if(min > num[i]){
                min = num[i];
            }
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println("가장 적은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
