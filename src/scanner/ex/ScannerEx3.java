package scanner.ex;

import java.util.Scanner;
// shift + f6 변수이름 전체 바꾸기
public class ScannerEx3 {

    public static void main(String[] args) {

        int foodPrice = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요(피자, 치킨, 햄버거): ");
        String foodName = scanner.nextLine();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = scanner.nextInt();

        if (foodName.equals("피자")){
            foodPrice = 13000;
            int totalPrice = foodPrice * foodQuantity;
            System.out.println(foodName + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

        } else if (foodName.equals("치킨")) {
            foodPrice = 20000;
            int totalPrice = foodPrice * foodQuantity;
            System.out.println(foodName + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

        } else if (foodName.equals("햄버거")) {
            foodPrice = 10000;
            int totalPrice = foodPrice * foodQuantity;
            System.out.println(foodName + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
        } else {
            System.out.println("잘못된 주문입니다. 음식 이름을 확인해주세요.");
        }

    }
}
