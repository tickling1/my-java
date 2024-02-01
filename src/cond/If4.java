package cond;
/*
else if 문은 앞선 if 문의 조건이 거짓일때 다음조건을 검사한다.
if문이 참이라면 else if를 실행하지 않는다.
불필요한 조건검사를 피하고 코드의 효율성을 향상시킬 수 있다.
 */
public class If4 {

    public static void main(String[] args) {

        int age = 100000000;

        if(age <= 7){
            System.out.println("미취학 아동입니다.");
        } else if (age <= 13) {
            System.out.println("당신은 초등학생입니다.");
        } else if( age <= 16){
            System.out.println("당신은 중학생입니다.");
        } else if (age <= 19) {
            System.out.println("당신은 고등학생입니다.");
        } else if (age <= 98) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("DIE");
        }
    }
}
