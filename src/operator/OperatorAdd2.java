package operator;

/*
++a: 증감연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위(Prefix) 증감 연산자라고 한다. (값을 먼저 증가시키고 뭘하고)
a++: 증감연산자를 피연산자 뒤에 둘 수 있다. 이것을 앞에 있다고 해서 후위(Postfix) 증감 연산자라고 한다. (변수를 먼저 쓰고 증가)
증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에, 본인의 값만 증가한다.

 */
public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예 (먼저 대입후 증가)
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감 연산자 사용 예 (증가 후 대입)
        a = 1; //a의 값을 다시 1로 지정
        b = 0; //b의 값을 다시 0으로 지정

        b = a++;
        System.out.println("a = " + a + ", b = " + b);


    }
}
