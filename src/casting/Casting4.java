package casting;

public class Casting4 {

    public static void main(String[] args) {

        int div1 = 3 / 2; // int / int = 1
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // int / int  = 1 대입될 때 자동형변환 => 1.0
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; //  double / int = 1.5 => double / double => 1.5
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; // double / int => double / double => 1.5
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;

        double result = (double) a / b; // double / int => double / double => 1.5
        System.out.println("result = " + result);
    }
}
