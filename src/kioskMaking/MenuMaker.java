package kioskMaking;

//import kioskMaking_2.CheckShoppingList;
//
import java.util.Scanner;

public abstract class MenuMaker { // 각 메뉴판의 토대가 되는 추상 클래스
    public void callSelectableMenu() { // 아직 전체적인 틀을 못 잡아 추상클래스는 나중에 완성시키기로
        String menuName;
        String[] OrederMenu = {"장바구니", "주문 취소"};
    }
}

class CoffeeAndColdBrewMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 각 메뉴판마다 바뀌는 것 중 겹치는 것 객체화
        // 메뉴판 이름
        String menuName = "커피 & 콜드브루";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 커피 & 콜드브루 메뉴 // 이 배열은 추상클래스에 넣기 힘들 듯 해서 뺌
        String[] coffeeAndColdBrewMenu = {"커피1", "커피2", "커피3", "커피4", "콜드브루1", "콜드브루2"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            // 이 부분은 각 메뉴판에서도 출력할 것이기 때문에 나중에 메서드화
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : coffeeAndColdBrewMenu) { // 각 메뉴마다 원하는 메뉴리스트만 불러올 수 있는 방법 찾아보기
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= coffeeAndColdBrewMenu.length) {
//                CheckShoppingList.checkShoppingList(coffeeAndColdBrewMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == coffeeAndColdBrewMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == coffeeAndColdBrewMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class LatteMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 메뉴판 이름
        String menuName = "라떼";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 라떼 메뉴
        String[] latteMenu = {"라떼1", "라떼2", "라떼3", "라떼4", "라떼5", "라떼6"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : latteMenu) {
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= latteMenu.length) {
//                CheckShoppingList.checkShoppingList(latteMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == latteMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == latteMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class ChocoMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 메뉴판 이름
        String menuName = "초코";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 초코 메뉴
        String[] chocoMenu = {"초코1", "초코2", "초코3", "초코4"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : chocoMenu) {
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= chocoMenu.length) {
//                CheckShoppingList.checkShoppingList(chocoMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == chocoMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == chocoMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class AdeAndMojitoMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 메뉴판 이름
        String menuName = "라떼";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 에디드, 모히또 메뉴
        String[] adeAndMojitoMenu = {"에디드1", "에이드2", "에이드3", "에이드4", "모히또1", "모히또2", "모히또3"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : adeAndMojitoMenu) {
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= adeAndMojitoMenu.length) {
//                CheckShoppingList.checkShoppingList(adeAndMojitoMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == adeAndMojitoMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == adeAndMojitoMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class SmoothieAndFrappeMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 메뉴판 이름
        String menuName = "라떼";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 스무디, 프라페 메뉴
        String[] smoothieAndFrappeMenu = {"스무디1", "스무디2", "스무디3", "프라페1", "프라페2"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : smoothieAndFrappeMenu) {
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= smoothieAndFrappeMenu.length) {
//                CheckShoppingList.checkShoppingList(smoothieAndFrappeMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == smoothieAndFrappeMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == smoothieAndFrappeMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class TeaAndJuiceMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 메뉴판 이름
        String menuName = "라떼";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 티, 주스 메뉴
        String[] teaAndJuiceMenu = {"티1", "티2", "주스1", "주스2"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : teaAndJuiceMenu) {
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= teaAndJuiceMenu.length) {
//                CheckShoppingList.checkShoppingList(teaAndJuiceMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == teaAndJuiceMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == teaAndJuiceMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

class DessertMenuClass {
    public static void callSelectableMenu() {
        Main main = new Main();
        // 메뉴판 이름
        String menuName = "라떼";
        // 장바구니, 주문 초기화 메뉴
        String[] orderMenu = {"장바구니", "주문 취소"};

        // 디저트 메뉴
        String[] dessertMenu = {"디저트", "디저트2", "디저트3", "디저트4", "디저트5", "디저트6", "디저트7", "디저트8", "디저트9"};

        while (true) {
            // 선택할 수 있는 대상에 번호 추가
            int i = 1;
            System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
            System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

            System.out.println("[" + menuName + " 메뉴]");
            System.out.println("+------------------------");
            for (String mainMenuSelect : dessertMenu) {
                System.out.println("| " + i + ". " + mainMenuSelect);
                i++;
            }
            System.out.println("+------------------------");
            System.out.println("\n[장바구니 확인, 주문 취소]");
            for (String orderMenuSelect : orderMenu) {
                System.out.println(i + ". " + orderMenuSelect);
                i++;
            }
            Scanner orderNumber = new Scanner(System.in);
            int selectedOrderNumber = orderNumber.nextInt();
            if (selectedOrderNumber >= 1 && selectedOrderNumber <= dessertMenu.length) {
//                CheckShoppingList.checkShoppingList(dessertMenu, selectedOrderNumber);
            } else if (selectedOrderNumber == dessertMenu.length + 1) {
                System.out.println("장바구니 출력");
                break;
            } else if (selectedOrderNumber == dessertMenu.length + 2) {
                System.out.println("주문을 취소하였습니다.");
                System.out.println();
                main.mainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}

