package cond;
/*
if문 vs switch문
switch 문은 참 거짓의 결과가 나오는 조건이 아니라, 단순히 값만 넣을 수 있다.
switch 문은 조건식이 특정 case와 같은지만 체크할 수 있다.
if문은 참 거짓결과가 나오는 조건식을 자유롭게 적을 수 있다.
 */

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;
        int coupon;

            switch (grade) {
                case 1:
                coupon = 1000;
                break;

                case 2: //break 문이 없으면 밑에 코드를 실행한다.
                case 3:
                coupon = 3000;
                break;

                default:
                coupon = 500;

            }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}