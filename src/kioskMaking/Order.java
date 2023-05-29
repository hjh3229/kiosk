package kioskMaking;

import java.util.Scanner;

public class Order {
    // 장바구니
    public void shoppingCart() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[주문 내역]");

    }
}

class CheckShoppingList {
    // 장바구니 추가 확인 메서드
    public static void checkShoppingList(String[] menuName, int orderNumber) {
        Main main = new Main();

        System.out.println(menuName[orderNumber - 1]);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        if (check == 1) {
            System.out.println("확인");
            System.out.println();
            main.mainMenu();
        } else if (check == 2) {
            System.out.println("취소");
            System.out.println();
        } else {
            System.out.println("잘못 입력하였습니다.");
            System.out.println();
        }
    }
}
