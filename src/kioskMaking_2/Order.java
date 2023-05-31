package kioskMaking_2;

import java.util.*;

public class Order {


    //     장바구니 생성
    private ArrayList<Cart> order;
    public Order() {
        order = new ArrayList<>();
    }

    // 장바구니에 추가
    public void addOrder(String menuName, int price) {
        Cart plusCount = plusCount(menuName);
        if (plusCount != null) {
            plusCount.plusCount();
        } else {
            Cart cart = new Cart(menuName, price);
            order.add(cart);
            System.out.println(order.get(0).toString());
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
}