package scope;

public class Scope3_3 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            int sum2 = 20;
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;

        }
        System.out.println(sum);
        //System.out.println(sum2);
    }
}
