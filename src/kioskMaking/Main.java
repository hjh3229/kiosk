package kioskMaking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        // 메인 메뉴판에서 사용자가 선태할 수 있는 사항
        String[] mainMenu = {"커피 & 콜드브루", "라떼", "초코", "에이드 & 모히또", "스무디 & 프라페", "티 & 주스", "디저트"};
        // 장바구니, 주문 초기화 메뉴
        String[] OrderMenu = {"장바구니", "주문 취소"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            // 이 부분은 각 메뉴판에서도 출력할 것이기 때문에 나중에 메서드화
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[메가커피 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : mainMenu) {
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
            switch (selectedOrderNumber) { // HashMap 을 이용해서 단축가능하면 단축(람다식 이용해야 함)
                case 1 :
                    CoffeeAndColdBrewMenuClass.callSelectableMenu();
                    break;
                case 2 :
                    LatteMenuClass.callSelectableMenu();
                    break;
                case 3 :
                    ChocoMenuClass.callSelectableMenu();
                    break;
                case 4 :
                    AdeAndMojitoMenuClass.callSelectableMenu();
                    break;
                case 5 :
                    SmoothieAndFrappeMenuClass.callSelectableMenu();
                    break;
                case 6 :
                    TeaAndJuiceMenuClass.callSelectableMenu();
                    break;
                case 7 :
                    DessertMenuClass.callSelectableMenu();
                    break;
                case 8 :
                    System.out.println("장바구니 출력");
                    break;
                case 9 :
                    System.out.println("주문을 취소하였습니다.");
                    System.out.println();
                    continue; // 9 입력 시 default도 출력되지 않도록
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    System.out.println();
            }
        }
    }
}
