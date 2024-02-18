package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.println("5개의 정수를 입력하세요: ");
        int[] num = {scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt()};

        /*
        for (int nums : num){
            System.out.print(nums);
         */
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);

            if (num.length > count) {
                System.out.print(", ");
            }
            count++;
        }
    }
}
