package loop.ex;

public class StarEx5 {

    public static void main(String[] args) {

      /*  for (int i = 1; i <= 5; i ++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*int num = 6;

        for (int i = 1; i <= num; i++){
            for (int j = num + 1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*int num =  5;

        for (int i = 1; i <= num; i++){
            for (int j = num + 1; j > i; j--){
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        int num = 5;

        for (int i = 1; i <= num; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }

            for (int j = num + 1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
