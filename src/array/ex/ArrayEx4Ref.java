package array.ex;

import java.util.Scanner;

public class ArrayEx4Ref {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("원하시는 반복횟수를 정해주세요!");
        int count = scanner.nextInt();
        System.out.println("반복 횟수 만큼 숫자를 정해주세요!");

        while (true){
            if (i >= count){
                break;
            }
            int num = scanner.nextInt();
            sum += num;
            i++;
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + (double) sum / count);
    }
}
