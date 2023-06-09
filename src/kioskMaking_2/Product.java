package kioskMaking_2;

public class Product extends Menu {
    private int menuPrice;

    public int getMenuPrice() {
        return menuPrice;
    }

    public Product(String menuName, String menuDesc, int menuPrice) {
        super(menuName, menuDesc);
        this.menuPrice = menuPrice;
    }

    public String toString() {
        return String.format("%-13s | ₩ %5d | %s", getMenuName(), getMenuPrice(), getMenuDesc());
    }
}
