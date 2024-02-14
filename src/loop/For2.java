package loop;
/*
for( 1.초기식; 2. 조건식; 4. 증감식) {
	//코드
}

1.초기식이 실행된다. 주로 반복횟수와 관련된 변수를 선언하고 초기화 할 때
사용한다. 초기식은 딱 1번 사용된다.

2. 조건식을 검증한다. 참이면 코드를 실행하고, 거짓이면 for문을 빠져나간다.

3. 코드를 실행한다.

4. 코드가 종료되면 증감식을 실행한다. 주로 초기식에 넣은 반복 횟수와
관련된 변수의 값을 증가할 때 사용한다.

5. 다시 2. 조건식부터 시작한다.
 */
public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++){
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
