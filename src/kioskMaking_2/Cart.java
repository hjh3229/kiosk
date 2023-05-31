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

    public String toString() { return String.format("%-13s   %d    %d", menuName, price*count, count); }

    public void plusCount() {
        count++;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}