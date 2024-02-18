package array;

public class EnhancedFor1 {
    // iter 단축키 -> 향상된 for문 자동으로 생성
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        //향상된 for문, for-each문
        for (int number : numbers){
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; ++i){
            int number = numbers[i];
            System.out.println(number);
        }
    }
}
