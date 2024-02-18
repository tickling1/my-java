package scanner.ex;

import java.util.Random;
import java.util.Scanner;

public class NuclearGame {

    public static void main(String[] args) {

        System.out.println("유클리드 게임은 두 명이서 하는 게임이고, 자연수 2개로 시작한다.");
        System.out.println("큰 수를 작은 수의 배수만큼 뺀다.");
        System.out.println("이때, 큰 수는 음이 아닌 정수가 되어야 하며 전보다 작아져야 한다.");
        System.out.println("이런식으로 두 플레이어는 서로 번갈아가면서 게임을 한다. 이때, 큰 수를 0으로 만든 사람이 게임을 승리하게 된다.");
        System.out.println("===========================================================================================");
        Scanner scanner = new Scanner(System.in);

        int a = (int) (Math.random()*100);
        System.out.println("당신의 a: " + a);

        int b = (int) (Math.random()*100);
        System.out.println("당신의 b: " + b);

        int[] score;
        int repeat = 0;

        while(true){

            if (a == 0 || b == 0){
                System.out.println("게임끝!");
                System.out.println("당신의 횟수는: " + repeat);
                break;
            }

            if (a > b){

                System.out.print("b의 곱할 숫자를 입력해주세요: ");
                int a1 = scanner.nextInt();
                a = a - (b * a1);
                if (a < 0){
                    System.out.println("음수가 되어버렸습니다.");
                    System.out.println("You Lose.");
                    break;
                }
                score = new int[]{a, b};
                System.out.println("a: " + score[0] + ", b: " + score[1]);
                repeat ++;

            }else if (a < b){

                System.out.print("a의 곱할 숫자를 입력해주세요: ");
                int b1 = scanner.nextInt();
                b = b - (a * b1) ;

                if (b < 0){
                    System.out.println("음수가 되어버렸습니다.");
                    System.out.println("You Lose.");
                   break;
                }
                score = new int[]{a, b};
                System.out.println("a: " + score[0] + ", b: " + score[1]);
                repeat++;

            } else {
                System.out.println("당신의 횟수는: " + repeat);
                System.out.println("0이 되었습니다. 게임끝!");
            }
        }
    }
}
