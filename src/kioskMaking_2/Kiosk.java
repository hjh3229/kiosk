package kioskMaking_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    Order personalOrder = new Order();
    Order totalOrder = new Order();
    MenuCollection menuCollection = new MenuCollection();
    Waiting waiting = new Waiting();

    // 장바구니 확인, 주문 초기화 메뉴
    public void orderMenu(int menuNumber) {
        System.out.println("\n[주문 확인/취소]");
        System.out.println(menuNumber + ". 장바구니 확인\t\t" + (menuNumber + 1) + ". 주문 취소");
        System.out.println();
    }

    // 메뉴 주문 확인
    public void checkMenuOrder(String menuName, int orderNumber) {

        if (orderNumber <= menuCollection.productMap().get(menuName).size() && orderNumber >= 1){
            System.out.println();
            System.out.println();
            System.out.println(menuCollection.productMap().get(menuName).get(orderNumber - 1).toString());
            // 여기에 옵션 추가 메서드
            System.out.println();
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자를 눌러 선택해주세요. : ");
            int check = scanner.nextInt();
            if (check == 1) { // 옵션 추가 메서드가 boolean을 반환하게 해서 true 시 장바구니 추가, 아니면 탈출하도록
                personalOrder.addPersonalOrder(menuCollection.productMap().get(menuName).get(orderNumber - 1).getMenuName(), menuCollection.productMap().get(menuName).get(orderNumber - 1).getMenuPrice(), 1);
                if (personalOrder.addOption(menuName)) {
                    System.out.print("");
                } else if (!personalOrder.addOption(menuName)) {
                    System.out.println("주문을 취소하였습니다.");
                    return;
                }
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
        personalOrder.printOrder();
        System.out.println();
        System.out.println("총 주문 액수 : ₩ " + personalOrder.sumPrice());
        System.out.println();
        System.out.println("1. 확인       2. 취소");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 눌러 선택해주세요. : ");
        int check = sc.nextInt();
        if (check == 1) {
            totalOrder.total(personalOrder);
            personalOrder.rebootOrder();
            waiting.waitingNumber();
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
        System.out.print("숫자를 눌러 선택해주세요. : ");
        int check = sc.nextInt();
        if (check == 1) {
            personalOrder.rebootOrder();
            System.out.println("초기화하였습니다.");
        } else if (check == 2) {
            System.out.println("취소하였습니다.");
        }
    }

    // 전체 판매 기록 출력
    public void printTotal() {
        System.out.println("[판매 내역]");
        totalOrder.printOrder();
        System.out.println();
        System.out.println("총 판매 액수 : ₩ " + totalOrder.sumPrice());
        System.out.println();
        System.out.print("닫기 위해선 아무 숫자나 눌러주세요.");

        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
    }
}
