package cond;
/*
이미 조건을 만족해도 불필요한 다음 조건을 계속 검사해야 한다.
이렇게 되면 코드의 효율성이 떨어진다.
 */
public class If3 {

    public static void main(String[] args) {

        int age = 8;

        if(age>=20){
            System.out.println("당신은 성인입니다.");
        }
        if (17 <= age && age <= 19) {
            System.out.println("당신은 고등학생입니다.");
        }
        if(14 <= age && age <= 16){
            System.out.println("당신은 중학생입니다.");
        }
        if (8 <= age && age <= 13) {
            System.out.println("당신은 초등학생입니다.");
        }
        if(age <= 7){
            System.out.println("미취학 학생입니다.");
        }
    }
}
