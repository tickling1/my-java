package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 60;
        String grade;

        if(score < 60 ){
            grade = "F";
        } else if (score < 70 ) {
            grade = "D";
        } else if (score < 80) {
            grade = "C";
        } else if (score < 90) {
            grade = "b";
        } else {
            grade = "A";
        }
        System.out.println("학점은 " + grade + " 입니다.");
    }
}
