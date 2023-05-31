package kioskMaking_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    Order ord = new Order();
    MenuCollection menuCollection = new MenuCollection();

    // 장바구니 확인, 주문 초기화 메뉴
    public void orderMenu(int menuNumber) {
        System.out.println("\n[주문 확인/취소]");
        System.out.println(menuNumber + ". 장바구니 확인\t\t" + (menuNumber + 1) + ". 주문 취소");
    }

    // 메뉴 주문 확인
    public void checkMenuOrder(String menuName, int orderNumber) {

        if (orderNumber <= menuCollection.productMap().get(menuName).size() && orderNumber >= 1){
            System.out.println(menuCollection.productMap().get(menuName).get(orderNumber - 1).toString());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            Scanner scanner = new Scanner(System.in);
            int check = scanner.nextInt();
            if (check == 1) {
                ord.addOrder(menuCollection.productMap().get(menuName).get(orderNumber - 1).getMenuName(), menuCollection.productMap().get(menuName).get(orderNumber - 1).getMenuPrice());
                System.out.println("장바구니에 추가하였습니다.");
                System.out.println();
            } else if (check == 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
            } else {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
            }
        } else if (orderNumber == menuCollection.productMap().get(menuName).size() + 1) {
            shoppingCart();
        } else if (orderNumber == menuCollection.productMap().get(menuName).size() + 2) {
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
    }

    // 장바구니 확인
    public void shoppingCart() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[주문 내역]");
        ord.printOrder();
        System.out.println();
        System.out.println("1. 확인       2. 취소");

        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            // 총 판매 금액, 목록에 저장하는 메서드
            // 장바구니를 초기화 하는 메서드
        } else if (check == 2) {
            System.out.println("주문을 취소하였습니다.");
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
    }

    // 장바구니 초기화
    public void rebootShoppingCart() {
        System.out.println("장바구니를 초기화하시겠습니까?");
        System.out.println();
        System.out.println("1. 확인       2. 취소");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == 1) {
            // 장바구니를 초기화 하는 메서드
            System.out.println("초기화하였습니다.");
        } else if (answer == 2) {
            System.out.println("취소하였습니다.");
        }
    }
}
