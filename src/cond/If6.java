package cond;
/*
if 문에 여러 조건이 있다고 항상 if -else로 묶어서
사용할 수 있는 것은 아니다. 조건이 서로 영향을 주지 않고
각각 실행해야 하는 경우에는 else if문을 사용하면 안되고,
대신에 여러 if문을 사용한다.
여러 독립적인 조건을 검사해야하는 경우가 그런 상황의 대표적인 사례
ex) 중복할인
 */
public class If6 {

    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000){
            discount += 1000;
        } else if(age <= 10){
            discount += 1000;
        }

        int result = price - discount;
        System.out.println("총 가격은 " + result + "원 입니다.");
        
        if(true)
            System.out.println("if문에서 실행됨"); //코드가 한줄일 때 { } 생략 가능
    }
}
