package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 1: 메서드 호출
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과1 출력:" + sum2);
    }

    //add 메서드
    // 2: 매개(파라미터) 변수 a = 5, b = 10이 전달되면서 메서드가 수행된다.
    public static int add(int a, int b){

        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
