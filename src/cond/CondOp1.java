package cond;
/*
삼항 연산자

if 문을 사용할 떄 다음과 같이 단순히 참과 거짓에 따라 특정 값을
구하는 경우가 있다. 이럴때는 삼항 연산자 또는 조건 연산자라고 불리는
? : 연사자를 사용할 수 있다. 이 연산자를 사용하면 if문과 비교해서
간단히 코드를 작성 할 수 있다.
 */
public class CondOp1 {

    public static void main(String[] args) {
        int age = 18;
        String status;

        if(age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}
