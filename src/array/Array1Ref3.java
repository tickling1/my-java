package array;

public class Array1Ref3 {

    public static void main(String[] args) {

        int[] student; //배열 변수 선언
        student = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < student.length; i++){ // student 배열의 길이: 5
            System.out.println("학생" + (i + 1) + " 점수: " + student[i]);
        }
    }
}
