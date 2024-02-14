package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int input;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

       /* while (true) {
            num = scanner.nextInt();

            if(num == -1){
                break;
            }
            sum += num;
            count++;
        }
        */

        while ( (input = scanner.nextInt()) != -1){
            sum += input;
            count++;
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + (double) sum / count);
    }
}
