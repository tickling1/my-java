package array.ex;

import java.util.Scanner;

public class ArrayEx2Ref {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 1;

        System.out.println("5개 정수 입력: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers){
            System.out.print(num);

            if(numbers.length > count){
                System.out.print(", ");
                count++;
            }
        }
    }
}
