package kioskMaking_2;

import java.util.*;

public class Order {

//     장바구니 생성
    private ArrayList<Cart> order;
    public Order() {
        order = new ArrayList<>();
    }

    public void addOrder(String menuName, int price) {
        Cart plusCount = plusCount(menuName);
        if (plusCount != null) {
            plusCount.plusCount();
        } else {
            Cart cart = new Cart(menuName, price);
            order.add(cart);
        }
    }

    private Cart plusCount(String menuName) {
        for (Cart cart : order) {
            if (cart.getMenuName().equals(menuName)) {
                return cart;
            }
        }
        return null;
    }

    public void printOrder() {
        for (Cart cart : order) {
            System.out.println(cart.toString());
        }
    }
}