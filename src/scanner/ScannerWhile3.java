package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        long sum = 0L;

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.print("숫자를 입력하세요: ");
            long num = input.nextLong();

            sum += num;

            if (num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("현재 합계: " + sum);

        }
        System.out.println("총 합계:" + sum);
    }
}
