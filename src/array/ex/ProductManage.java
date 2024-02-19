package array.ex;

import java.util.Scanner;

public class ProductManage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int productCount = 0;
        String[] productNames = new String[10];
        int[] productPrices = new int[10];

        while (true){

            System.out.println("1.상품 등록 | 2.상품 목록 | 3.종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(productCount == 10){
                System.out.println("상품이 10개가 넘었습니다. 목록을 확인해주세요.");
                productCount++;

            }else if (option == 1){
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                scanner.nextLine();

                productCount++;
            }
            if (option == 2){
                for (int i = 0; i < productCount; i++){
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }
            }
            if (option == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}
