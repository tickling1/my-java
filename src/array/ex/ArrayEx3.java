package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 횟수를 정해주세요: ");
        int count = scanner.nextInt();

        int[] num = new int[count];
        System.out.println(count + "개의 정수를 입력하세요: ");

        for (int i = num.length; i > 0; i--){
            num[i - 1] = scanner.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력: ");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if (i < num.length - 1){
                System.out.print(", ");
            }
        }
    }
}
