package kioskMaking_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    // 장바구니 확인, 주문 초기화 메뉴
    public void orderMenu(int menuNumber) {
        System.out.println("\n[주문 확인/취소]");
        System.out.println(menuNumber + ". 장바구니 확인\t\t" + (menuNumber + 1) + ". 주문 취소");
    }

    // 메뉴 주문 확인
    public void checkMenuOrder(String menuName, int orderNumber) {
        MenuCollection menuCollection = new MenuCollection();
        Main main = new Main();
        Order order = new Order();

        if (orderNumber <= menuCollection.productMap().get(menuName).size() && orderNumber >= 1){
            System.out.println(menuCollection.productMap().get(menuName).get(orderNumber - 1).toString());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            Scanner scanner = new Scanner(System.in);
            int check = scanner.nextInt();
            if (check == 1) {
                // 장바구니에 추가 메서드

                System.out.println("장바구니에 추가하였습니다.");
                System.out.println();
                main.kioskStarter(); // 장바구니에 담으면 메인메뉴로 돌아가기
            } else if (check == 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
            } else {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
            }
        } else if (orderNumber == menuCollection.productMap().get(menuName).size() + 1) {
            order.shoppingCart();
        } else if (orderNumber == menuCollection.productMap().get(menuName).size() + 2) {
            main.kioskStarter();
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
    }

    // 장바구니 확인
    public void shoppingCart() {
        Main main = new Main();
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[주문 내역]");
        System.out.println("1. 확인       2. 취소");

        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            // 장바구니에 추가하는 메서드
            main.kioskStarter();
        } else if (check == 2) {
            System.out.println("주문을 취소하였습니다.");
            main.kioskStarter();
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
    }

    // 장바구니 초기화
    public void rebootShoppingCart() {
        Main main = new Main();

        System.out.println("장바구니를 초기화하시겠습니까?");
        System.out.println();
        System.out.println("초기화하였습니다.");
        main.kioskStarter();
    }
}

class Cart {
}
