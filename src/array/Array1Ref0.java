package array;

import java.util.Scanner;

public class Array1Ref0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 사이즈를 적어주세요: ");
        int size = scanner.nextInt();

        int sum = 10;
        int[] list;
        list = new int[size];

        for (int i = 0; i <= size-1; i++){
            list[i] = sum;
            System.out.println("[i] = " + i + " sum = " + sum);
            sum += sum;
        }

    }
}
