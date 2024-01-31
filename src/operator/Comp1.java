package operator;
/*
== : (동등성)
!= : 불일치
> : 크다
< : 작다
>= :크거나 같다
<= :작거나 같다

비교 연산자를 사용하면 참 또는 거짓이라는 결과가 나온다.
참 거짓은 boolean 타입을 사용한다.

여기서 주의할점은 =와 ==는 다르다는 점
= : 대입연산자, 변수에 값을 대입한다.
== : 동등한지 확인하는 비교 연산자

불일치 연산자는 != 를 사용한다.
 */
public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean result = a == b;
        System.out.println(result);

    }
}
