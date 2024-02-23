package method.ex;

import java.util.Scanner;

public class MethodEx3Ref {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.print("1. 입금 | 2. 출금 | 3. 잔액 금액 | 4. 종료: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("입금할 금액을 적어주세요: ");
                int deposit = scanner.nextInt();
                balance = deposit(balance, deposit);
                System.out.println("현재 잔액: " + balance + "원");
            }
            if (option == 2) {
                System.out.print("출금할 금액을 적어주세요: ");
                int withdraw = scanner.nextInt();
                balance = withdraw(balance, withdraw);
                System.out.println("현재 잔액: " + balance + "원");
            }
            if(option == 3){
                System.out.println("현재 금액은 " + balance + "원 입니다.");
            }
            if(option == 4){
                System.out.println("종료합니다.");
                break;
            }
        }
    }
    public static int deposit(int balance, int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다.");
        return balance;
    }
    public static int withdraw(int balance,int withdrawAmount){

        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다.");
            return balance;

        } else {
            System.out.println(withdrawAmount + "원 출금하려 했으나 잔액이 부족합니다.");
            System.out.println("최종 잔액: " +  balance);
            return balance;
        }
    }

}
