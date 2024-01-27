package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);
        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);
        //곱하기
        int multi = a * b;
        System.out.println("a * b= " + multi);
        //나눗셈 (10 / 0 같이 0으로 나눌수 없다.)
        int div = a / b; // -> 2.5 이지만 출력값은 int형 끼리 나눔하면 나머지가 날라감.
        System.out.println("a / b = " + div);
        //나머지
        int mod= a % b;
        System.out.println("a % b = " + mod);
    }
}
