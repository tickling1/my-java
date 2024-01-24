package variable;
// 변수를 선언하고, 선언한 변수에 처음으로 값을 저장하는 것을 변수 초기화라 한다.
public class Var5 {

    public static void main(String[] args) {
        int a; // 1. 변수 선언 , 초기화 각각 따로
        a = 1;
        System.out.println(a);

        int b = 2; // 2. 변수를 선언+초기화를 한번에!
        System.out.println(b);

        int c = 3, d = 4; // 3. 여러 변수 선언과 초기화를 한번에
        System.out.println(c);
        System.out.println(d);
    }
}
