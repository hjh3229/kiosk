package kioskMaking_2;

public class Cart {


    private String menuName;
    private int price;
    private int count;

    public Cart(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
        this.count = 1;
    }

    public String toString() { return String.format("%-13s   %d    %d", menuName, (price * count), count); }

    public void plusCount() {
        count++;
    }

    public String getMenuName() {
        return menuName;
    }
}