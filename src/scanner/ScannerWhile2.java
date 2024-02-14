package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

        while (true) {

            System.out.print("첫 번째 숫자: ");
            int a = scanner.nextInt();

            System.out.print("두 번째 숫자: ");
            int b = scanner.nextInt();

            int sum = a + b;

            if(a == 0 && b ==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("두 숫자의 합: " + sum);
        }

    }
}
