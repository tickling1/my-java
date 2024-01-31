package operator;
/*
대입 연산자(=)는 값을 변수에 할당하는 연산자다. 이 연산자를 사용하면 변수에 값을 할당할 수 있다.

축약(복합)대입 연산자
산술 연산자와 대입 연산자를 한번에 축약해서 사용할 수 있는데, 아것을 축약(복합)대입 연산자라 한다.
연산자 종류: +=, -=, *=, /=, %=
ex) i = i + 3 => i +=3
 */
public class Assign1 {
    public static void main(String[] args) {
        int a =5;
        a += 3;
        a -= 2;
        a *= 4;
        a /= 3;
        a %= 5;
        System.out.println(a);
    }
}
