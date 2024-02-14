package casting;

public class Casting2 {

    public static void main(String[] args) {

        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환 (int)가 흑막이라고 할수 있겠다.
        System.out.println(intValue);



    }
}
