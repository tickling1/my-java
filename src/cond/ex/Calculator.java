package cond.ex;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("계산기 입니다. 종료하고 싶다면 부등호 입력칸에 종료를 쳐주세요.");
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요: ");
        int score = sc.nextInt();

        while (true) {
            System.out.print("부등호를 입력해주세요 ex) +, -, *, /, 종료 : " );
            String str = sc.next();
            if (str.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("정수를 입력해주세요: ");
            int b = sc.nextInt();


            if (str.equals("+")) {
                score = score + b;
                System.out.println("현재 값은: " + score);
            }
            if (str.equals("-")) {
                score = score - b;
                System.out.println("현재 값은: " + score);
            }
            if (str.equals("*")) {
                score = score * b;
                System.out.println("현재 값은: " + score);
            }
            if (str.equals("/")) {
                score = score / b;
                System.out.println("현재 값은: " + score);
            }

        }
    }
}
