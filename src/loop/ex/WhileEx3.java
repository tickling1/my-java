package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max){
            System.out.println("반복 횟수: " + i);
            sum += i;
            System.out.println("중간 합계 " + sum);
            i++;

        }
        System.out.println("max=" + max);
        System.out.println(sum);
    }
}
