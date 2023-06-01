package kioskMaking_2;

import java.util.*;

public class Order {
    //     장바구니 생성
    private ArrayList<Cart> order;
    public Order() {
        order = new ArrayList<>();
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

    // 현재 리시트를 다른 리스트에 옮기기
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