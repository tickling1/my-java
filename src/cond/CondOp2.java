package cond;
/*
삼항 연산자, 조건 연산자
(조건) ? 참_표현식 : 거짓_표현식

if 문을 사용할 떄 다음과 같이 단순히 참과 거짓에 따라 특정 값을
구하는 경우가 있다. 이럴때는 삼항 연산자 또는 조건 연산자라고 불리는
? : 연사자를 사용할 수 있다. 이 연산자를 사용하면 if문과 비교해서
간결한 코드를 작성 할 수 있다.
 */
public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
