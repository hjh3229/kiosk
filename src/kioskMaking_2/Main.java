package kioskMaking_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.kioskStarter();
    }

    public void kioskStarter() {
        MenuCollection menuCollection = new MenuCollection();

        menuCollection.menuBar("메가커피");

        System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
        int menuNumber = 1;
        for (Menu menu : menuCollection.menuList()) {
            System.out.println("| " + menuNumber +". "+ menu.toString());
            menuNumber++;
        }
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------");

        Order order = new Order();
        EachMenuBuilder eachMenuBuilder = new EachMenuBuilder();
        order.orderMenu(menuNumber);
        Scanner sc = new Scanner(System.in);
        eachMenuBuilder.buildEachMenu(sc.nextInt());
    }
}
