package array.ex;

import java.util.Scanner;

public class ProductAdminExRef {

    public static void main(String[] args) {
        // 유연한 배열 arrayList 뒤에서 배움.
        int maxProduct = 10;
        
        //클래스 객체로 상품의 이름과 가격을 한번에 관리가능
        String[] productNames = new String[maxProduct];
        int [] productPrices = new int[maxProduct];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("1. 상품등록 2. 상품목록 3. 종료 \n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){

                if (productCount >= maxProduct){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                productCount++;

            }else if (menu == 2){
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++){
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            }else if (menu == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
