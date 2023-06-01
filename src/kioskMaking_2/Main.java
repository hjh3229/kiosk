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
            System.out.print("숫자를 눌러 메뉴를 선택해주세요. : ");
            int check = sc.nextInt();
            if (check == 999) {
                break;
            } else { eachMenuBuilder.buildEachMenu(check); }
        }
    }
}
