package cond;
/*
switch 문은 앞서 배운 if 문을 조금 더 편리하게 사용할 수 있는 기능이다.
참고로 if 문은 비교연산자를 사용할 수 있지만, switch 문은 단순히 값이
같은지만 비교할 수 있다.

조건식의 결과 값이 어떤 case의 값과 일치하면 해당 case의 코드를 실행한다.
break 문은 현재 실행 중인 코드를 끝내고 switch 문을 빠져나가게 하는 역할을 한다. 만약 break 문이 없으면,
일치하는 case 이후의 모든 case 코드들이 순서대로 실행된다.
default는 조건식의 결과값이 모든 case 의 값과 일치하지 않을 떄 실행된다.
if문의 else와 같다.
 */

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;
        int coupon;

            switch (grade) {
                case 1:
                coupon = 1000;
                break;

                case 2:
                coupon = 2000;
                break;

                case 3:
                coupon = 3000;
                break;

                default:
                coupon = 500;

            }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}