package kioskMaking;

import java.util.Scanner;

public abstract class MenuMaker { // 각 메뉴판의 토대가 되는 추상 클래스
    public void callSelectableMenu() {
        String menuName;
        String[] OrederMenu = {"장바구니", "주문 취소"};
    }
}

class CoffeeAndColdBrewMenu {
    public static void callSelectableMenu() {
        // 각 메뉴판마다 바뀌는 것 중 겹치는 것 객체화
        // 메뉴판 이름
        String menuName = "커피 & 콜드브루";
        // 장바구니, 주문 초기화 메뉴
        String[] OrderMenu = {"장바구니", "주문 취소"};

        // 커피 & 콜드브루 메뉴
        String[] CoffeeAndColdBrewMenu = {"커피1", "커피2", "커피3", "커피4", "커피5", "커피6"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            // 이 부분은 각 메뉴판에서도 출력할 것이기 때문에 나중에 메서드화
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : CoffeeAndColdBrewMenu) { // 각 메뉴마다 원하는 메뉴리스트만 불러올 수 있는 방법 찾아보기
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : OrderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= CoffeeAndColdBrewMenu.length) {
                CheckShoppingList.checkShoppingList(CoffeeAndColdBrewMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == CoffeeAndColdBrewMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == CoffeeAndColdBrewMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class LatteMenu {
    public static void callSelectableMenu() {
        // 각 메뉴판마다 바뀌는 것 중 겹치는 것 객체화
        // 메뉴판 이름
        String menuName = "라떼";
        // 장바구니, 주문 초기화 메뉴
        String[] OrderMenu = {"장바구니", "주문 취소"};

        // 라떼 메뉴 // 이 배열은 추상클래스에 넣기 힘들 듯 해서 뺌
        String[] LatteMenu = {"라떼1", "라떼2", "라떼3", "라떼4", "라떼5", "라떼6"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            // 이 부분은 각 메뉴판에서도 출력할 것이기 때문에 나중에 메서드화
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : LatteMenu) { // 각 메뉴마다 원하는 메뉴리스트만 불러올 수 있는 방법 찾아보기
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : OrderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= LatteMenu.length) {
                CheckShoppingList.checkShoppingList(LatteMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == LatteMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == LatteMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class CheckShoppingList {
    // 장바구니 추가 확인 메서드
    public static void checkShoppingList(String[] menuName, int orderNumber) {
        System.out.println(menuName[orderNumber - 1]);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        if (check == 1) {
            System.out.println("확인");
            System.out.println();
        } else if (check == 2) {
            System.out.println("취소");
            System.out.println();
        } else {
            System.out.println("잘못 입력하였습니다.");
            System.out.println();
        }
    }
}