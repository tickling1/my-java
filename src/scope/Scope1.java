package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 변수 생존 시작

        if (true){
            int x = 20; // x 변수 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 변수 사망

        //System.out.println("if x = " + x); // 오류, 변수 x에 접근 불가
        System.out.println("if m = " + m);

    } // m 변수 사망
}
