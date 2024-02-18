package array;

public class Array1Ref1 {

    public static void main(String[] args) {

        int[] student; //배열 변수 선언
        student = new int[5]; //배열 생성 ex) int가 5개 있는 긴 그릇을 만들었다.

        System.out.println(student);

        //변수 값 대입 (배열은 0번 부터 시작)
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;
        student[5] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + student[0]);
        System.out.println("학생2 점수: " + student[1]);
        System.out.println("학생3 점수: " + student[2]);
        System.out.println("학생4 점수: " + student[3]);
        System.out.println("학생5 점수: " + student[4]);
    }
}
