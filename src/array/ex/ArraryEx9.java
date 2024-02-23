package array.ex;

import java.util.Scanner;

public class ArraryEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("반복할 횟수: ");
        int count = scanner.nextInt();
        int[] num = new int[count];
        // 3, 1 ,2
        for (int i = 0; i < num.length; i++){
            System.out.print("숫자 입력: ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length; i++) { // n[0] = 1   n[1] = 3  n[2] = 2
            for (int j = 0; j < num.length; j++) { // 0 0, 0 1, 0 2
                if (num[i] > num[j]) { // 3 2
                    int sort;
                    sort = num[i]; // n[2] = 2
                    num[i] = num[j]; // n[1] = n[2]
                    num[j] = sort;  // n[2] = 3
                }
            }
        }

        for (int i = num.length; i > 0; i--) {
            System.out.print(num[i - 1]);
            if (i > 1){
                System.out.print(", ");
            }
        }

    }
}
