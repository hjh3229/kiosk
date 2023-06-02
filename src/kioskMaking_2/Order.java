package kioskMaking_2;

import java.util.*;

public class Order {
    //     장바구니 생성
    private ArrayList<Cart> order;
    public Order() {
        order = new ArrayList<>();
    }
    MenuCollection menuCollection = new MenuCollection();
    Scanner sc = new Scanner(System.in);

    // 옵션 추가
    public boolean addOption(String menuName) { // 메뉴 카테고리만 확인
        boolean option = true;
        String optionName;
        int optionPrice = 0;
        int optionCount = 0;
        if (!menuCollection.menuList().get(6).getMenuName().equals(menuName)) { // 디저트가 아니라면 옵션 추가
            if (menuCollection.menuList().get(0).getMenuName().equals(menuName) || menuCollection.menuList().get(1).getMenuName().equals(menuName) || menuCollection.menuList().get(2).getMenuName().equals(menuName)) {
                // 메뉴가 커피 & 콜드브루 or 라떼 or 초코
                while (true) { // HOT, ICED 선택 가능
                    System.out.println();
                    System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| HOT or ICED를 선택해주세요.");
                    System.out.println("| 1. HOT");
                    System.out.println("| 2. ICED");
                    System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("주문을 취소하고 싶으시다면 0을 눌러주세요.");
                    System.out.print("선택해 주세요 : ");
                    int check = sc.nextInt();
                    if (check == 1) {
                        optionName = "+ HOT";
                        addOrder(optionName, optionPrice, optionCount);
                        System.out.println(optionName);
                        break;
                    } else if (check == 2) {
                        optionName = "+ ICED";
                        addOrder(optionName, optionPrice, optionCount);
                        break;
                    } else if (check == 0) {
                        return !option;
                    } else {
                        System.out.println("제대로 선택해 주세요.");
                    }
                }
            }
            if (menuCollection.menuList().get(0).getMenuName().equals(menuName) || menuCollection.menuList().get(1).getMenuName().equals(menuName)) {
                // 메뉴가 커피 & 콜드브루 or 라떼
                while (true) { // 샷 추가 얼마든지 가능
                    System.out.println();
                    System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| 샷 옵션을 선택해 주세요");
                    System.out.println("| 1. 샷 추가 (+ 500)");
                    System.out.println("| 2. 연하게 (주의!! : 샷 추가 가격은 받습니다!!)");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("| 3. 확인");
                    System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("주문을 취소하고 싶으시다면 0을 눌러주세요.");
                    System.out.print("선택해 주세요 : ");
                    int check = sc.nextInt();
                    if (check == 1) {
                        optionName = "+ 샷 추가";
                        optionPrice = 500;
                        optionCount = 1;
                        addOrder(optionName, optionPrice, optionCount);
                    } else if (check == 2) {
                        optionName = "+ 연하게";
                        addOrder(optionName, optionPrice, optionCount);
                        break;
                    } else if (check == 3) {
                        break;
                    } else if (check == 0) {
                        return !option;
                    } else {
                        System.out.println("제대로 선택해 주세요.");
                    }
                }
                while (true) { // 시럽 추가
                    System.out.println();
                    System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| 시럽 옵션을 선택해 주세요");
                    System.out.println("| 1. 바닐라 시럽 추가 (+ 500)");
                    System.out.println("| 2. 헤이즐넛 시럽 추가 (+ 500)");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("| 3. 확인");
                    System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("주문을 취소하고 싶으시다면 0을 눌러주세요.");
                    System.out.print("선택해 주세요 : ");
                    int check = sc.nextInt();
                    if (check == 1) {
                        optionName = "+ 바닐라 시럽 추가";
                        optionPrice = 500;
                        optionCount = 1;
                        addOrder(optionName, optionPrice, optionCount);
                    } else if (check == 2) {
                        optionName = "+ 헤이즐넛 시럽 추가";
                        optionPrice = 500;
                        optionCount = 1;
                        addOrder(optionName, optionPrice, optionCount);
                    } else if (check == 3) {
                        break;
                    } else if (check == 0) {
                        return !option;
                    } else {
                        System.out.println("제대로 선택해 주세요.");
                    }
                }
            }
            while (true) { // 모든 메뉴 휘핑크림, 알로에, 타피오카 얼마든지 추가가능
                System.out.println();
                System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                System.out.println("| 추가 옵션을 선택해 주세요");
                System.out.println("| 1. 휘핑크림 추가 (+ 500)");
                System.out.println("| 2. 알로에 펄 추가 (+ 500)");
                System.out.println("| 3. 타피오카 펄 추가 (+ 500)");
                System.out.println("|");
                System.out.println("|");
                System.out.println("| 4. 확인");
                System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("주문을 취소하고 싶으시다면 0을 눌러주세요.");
                System.out.print("선택해 주세요 : ");
                int check = sc.nextInt();
                if (check == 1) {
                    optionName = "+ 휘핑크림 추가";
                    optionPrice = 500;
                    optionCount = 1;
                    addOrder(optionName, optionPrice, optionCount);
                } else if (check == 2) {
                    optionName = "+ 알로에 펄 추가";
                    optionPrice = 500;
                    optionCount = 1;
                    addOrder(optionName, optionPrice, optionCount);
                } else if (check == 3) {
                    optionName = "+ 타피오카 펄 추가";
                    optionPrice = 500;
                    optionCount = 1;
                    addOrder(optionName, optionPrice, optionCount);
                } else if (check == 4) {
                    break;
                } else if (check == 0) {
                    return !option;
                } else {
                    System.out.println("제대로 선택해 주세요.");
                }
            }
            while (true) { // 개인 컵 여부
                System.out.println();
                System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                System.out.println("| 일회용을 사용하시겠습니까?");
                System.out.println("| 1. 일회용 컵 포장(일회용 컵 반환 시 돌려드립니다.) (+ 500)");
                System.out.println("| 2. 개인 컵 사용");
                System.out.println("| 3. 매장 내 이용");
                System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("주문을 취소하고 싶으시다면 0을 눌러주세요.");
                System.out.print("선택해 주세요 : ");
                int check = sc.nextInt();
                if (check == 1) {
                    optionName = "+ 일회용 컵 사용";
                    optionPrice = 500;
                    optionCount = 1;
                    addOrder(optionName, optionPrice, optionCount);
                    break;
                } else if (check == 2) {
                    optionName = "+ 개인 컵 사용";
                    addOrder(optionName, optionPrice, optionCount);
                    break;
                } else if (check == 3) {
                    optionName = "+ 매장";
                    addOrder(optionName, optionPrice, optionCount);
                    break;
                } else if (check == 0) {
                    return !option;
                } else {
                    System.out.println("제대로 선택해 주세요.");
                }
            }
        }
        return option;
    }

    // 장바구니에 추가
    public void addOrder(String menuName, int price, int count) {
        Cart plusCount = plusCount(menuName);
        if (plusCount != null) {
            plusCount.plusCount(count);
        } else {
            Cart cart = new Cart(menuName, price, count);
            order.add(cart);
        }
    }

    // 장바구니에 추가할 때 같은 이름의 메뉴가 있으면 카운트만 +1
    private Cart plusCount(String menuName) {
        for (Cart cart : order) {
            if (cart.getMenuName().equals(menuName)) {
                return cart;
            }
        }
        return null;
    }

    // 장바구니 출력
    public void printOrder() {
        for (Cart cart : order) {
            System.out.println(cart.toString());
        }
    }

    // 장바구니 초기화
    public void rebootOrder() {
        order.clear();
    }

    // 장바구니 금액 총합
    public int sumPrice() {
        int totalPrice = 0;
        for (Cart cart : order) {
            totalPrice += (cart.getPrice() * cart.getCount());
        }
        return totalPrice;
    }

    // 장바구니 내용을 지우기 전에 전체 결산으로 옮기기
    public void total(Order order) {
        for (Cart cart : order.order) {
            String menuName = cart.getMenuName();
            int price = cart.getPrice();
            int count = cart.getCount();
            this.addOrder(menuName, price, count);
        }
    }
}

class Waiting {
    private int waitingNumber;

    public Waiting() {
        waitingNumber = 0;
    }

    public void waitingNumber() {
        waitingNumber++;
        System.out.println("\n손님의 대기 번호는 [" + waitingNumber + "]번 입니다.\n");
    }
}