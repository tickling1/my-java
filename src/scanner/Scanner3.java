package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수1: ");
        int a = scanner.nextInt();

        System.out.print("정수2: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("더 큰숫자: " + a);
        }else if (a < b) {
            System.out.println("더 큰숫자: " + b);
        }else {
            System.out.println("두 숫자는 같습니다.");
        }

    }
}
