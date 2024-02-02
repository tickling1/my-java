package cond.ex;

public class MovieRateEx {

    public static void main(String[] args) {

        double rating = 7.2;
        String movie;

        if (rating <= 7){
            movie = "고질라";
            System.out.println(movie + "을 추천합니다.");
        } if (rating <= 8) {
            movie = "토이스토리";
            System.out.println(movie + "을 추천합니다.");
        } if (rating <= 9) {
            movie = "어바웃타임";
            System.out.println(movie + "을 추천합니다.");
        }


    }
}
