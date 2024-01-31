package cond;

public class If1 {
    public static void main(String[] args) {

        int age = 25; //사용자 나이

        if (age >= 18){ //true가 되면 실행
            System.out.println("성인입니다! 담배와 술을 할 수 있겠군요!");
        }
        if (age < 18){ //false가 되면 바로 다음 라인으로 감
            System.out.println("미성년자입니다! 담배과 술을 멀리하세요!");

        }
    }
}
