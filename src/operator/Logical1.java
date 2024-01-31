package operator;
/*
논리 연산자
&& : 두 연산자가 모두 참이면 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
|| : 두 피연산자 중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
! : 피연산자의 논리적 부정을 반환, 즉 참이면 거짓을, 거짓이면 참을 반환
 */
public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&& : AND 연산"); // 두 연산자 중 모두 참
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("|| : OR 연산"); // 두 연산자 중 하나라도 참이면 true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(! a);
        System.out.println(! b);

        

    }
    
}
