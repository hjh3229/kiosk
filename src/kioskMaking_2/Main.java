package kioskMaking_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.kioskStarter();
    }

    Kiosk kiosk = new Kiosk();
    EachMenuBuilder eachMenuBuilder = new EachMenuBuilder();
    public void kioskStarter() {
        MenuCollection menuCollection = new MenuCollection();


        while (true) {
            menuCollection.menuBar("메가커피");

            System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
            int menuNumber = 1;
            for (Menu menu : menuCollection.menuList()) {
                System.out.println("| " + menuNumber +". "+ menu.toString());
                menuNumber++;
            }
            System.out.println("+---------------------------------------------------------------------------------------------------------------------------");


            kiosk.orderMenu(menuNumber);
            Scanner sc = new Scanner(System.in);
            eachMenuBuilder.buildEachMenu(sc.nextInt());
        }
    }
}
