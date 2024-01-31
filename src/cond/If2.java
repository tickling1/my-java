package cond;
/*
else 문은 if 문에서 만족하는 조건이 없을 때 실행하는 코드 입니다.
else 문을 사용하면 앞서 진행했던 프로그램을 다음과 같이 더 간략하게 바꿀수 있다.
 */
public class If2 {

    public static void main(String[] args) {

        int age = 25;

        if(age >= 18) {
            System.out.println("성인 입니다.");
        }else{ // 만족하는 조건이 없을 때 실행되는 코드
            System.out.println("미성년자 입니다.");
        }
    }
}
