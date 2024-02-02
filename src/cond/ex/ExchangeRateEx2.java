package cond.ex;

import java.util.Scanner;

public class ExchangeRateEx2 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 적어주세요");
        double won = sc.nextDouble();

        System.out.println("환전받을 국가를 적어주세요 [미국,중국,일본,유럽]");
        String exchanged = sc.next();
        if (exchanged.equals("미국")){
            won /= 1324.0;
            System.out.println("환전 받을 돈은 USD " + Math.round(won*100)/100.0 + " 입니다.");
        } else if (exchanged.equals("중국")) {
            won /= 187.36;
            System.out.println("환전 받을 돈은 CNY " + Math.round(won*100)/100.0 + " 입니다.");
        } else if (exchanged.equals("일본")){
            won /= 9.04;
            System.out.println("환전 받을 돈은 JPY " + Math.round(won*100)/100.0 + " 입니다.");
        } else if(exchanged.equals("유럽")){
            won /= 1444.71;
            System.out.println("환전 받을 돈은 EUR " + Math.round(won*100)/100.0 + " 입니다.");
        } else {
            System.out.println("지원하지 않는 국가입니다.");
        }


    }
}
