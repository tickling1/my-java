package method.ex;

import java.util.Scanner;

public class MethodEx3Ref3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100000;

        while (true) {
            System.out.println("======================================");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 금액 | 4. 종료");
            System.out.println("======================================");
            System.out.print("선택: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                int deposit = scanner.nextInt();
                balance = deposit(balance, deposit);
            }else if (option == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdraw = scanner.nextInt();
                balance = withdraw(balance, withdraw);
            }
            else if(option == 3){
                System.out.println("현재 잔액은 " + balance + "원 입니다.");
            }
            else if(option == 4){
                System.out.println("최종 잔액: " +  balance);
                System.out.println("종료합니다.");
                break;
            }else {
                System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요");
            }
        }
    }
    public static int deposit(int balance, int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다." + " 현재 잔액은 " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance,int withdrawAmount){

        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다." + " 현재 잔액은 " + balance + "원");
            return balance;

        } else {
            System.out.println(withdrawAmount + "원 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }
}
