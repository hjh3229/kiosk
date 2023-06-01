package kioskMaking_2;

public class Cart {


    private String menuName;
    private int price;
    private int count;

    public Cart(String menuName, int price, int count) {
        this.menuName = menuName;
        this.price = price;
        this.count = count;
    }

    public String toString() { return String.format("%-13s   %d    %d", menuName, (price * count), count); }

    public void plusCount(int count) {
        this.count += count;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {return price;}

    public int getCount() {return count;}
}