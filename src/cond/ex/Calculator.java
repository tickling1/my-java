package cond.ex;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력해주세요 !");
        int a = sc.nextInt();
        System.out.println("정수를 입력해주세요 !");
        int b = sc.nextInt();
        System.out.println("부등호를 입력해주세요 ! ex) +, -, *, /");
        String str = sc.next();

        if(str.equals("+")){
            System.out.println(a + b);
        } else if(str.equals("-")){
            System.out.println(a - b);
        } else if(str.equals("*")){
            System.out.println(a * b);
        } else if(str.equals("/")){
            System.out.println(a / b);
        }


    }
}
