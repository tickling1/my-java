package scope;

public class Scope3_1 {
    //변수 값은 if을 지나도 초기화 값으로 변하지 않는다. 블록 안에서 선언한 변수의 값만 사라진다는 것 기억하자!

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
            m = 20;
        }
        System.out.println("temp = " + temp);
        System.out.println("m = " + m);
    }
}

