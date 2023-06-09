package kioskMaking_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private String menuName;
    private String menuDesc;

    public Menu(String menuName, String menuDesc) {
        this.menuName = menuName;
        this.menuDesc = menuDesc;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public String toString() {
        return String.format("%-18s |  %s", getMenuName(), getMenuDesc());
    }
}

class MenuCollection {
    public void menuBar(String menu) {
        System.out.println();
        System.out.println();
        System.out.println("MegaCoffee에 오신 것을 환영합니다!!");
        System.out.println("아래에서 메뉴판을 보고 주문하실 메뉴를 골라주세요!\n");

        System.out.println("[" + menu + " 메뉴]");
    }

    public ArrayList<Menu> menuList() {
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Coffee & ColdBrew", "최상의 원두와 메가커피만의 특별한 노하우로 내린 커피 & 콜드브루"));
        menuList.add(new Menu("Latte", "메가커피의 신선한 에스프레소와 부드러운 우유의 조화로 탄생한 부드럽고 크리미한 맛의 라떼"));
        menuList.add(new Menu("Choco", "메가커피에서 밖에 맛볼 수 없는 진하고 풍부한 초콜릿의 맛을 느낄 수 있는 초코 음료"));
        menuList.add(new Menu("Ade & Mojito", "다양한 과일 풍미와 청량한 탄산이 어우러진 메가커피의 에이드 & 모히또"));
        menuList.add(new Menu("Smoothie & Frappe", "건강과 맛을 동시에 채울 수 있고, 어린이부터 어른까지 모두에게 사랑받는 스무디 & 프라페"));
        menuList.add(new Menu("Tea & Juice", "천연 재료로 만들어진 주스는 비타민과 영양소가 가득하여 체력을 보충하고 활력을 불어넣어주는 주스와 심신을 안정시켜 주는 티"));
        menuList.add(new Menu("Dessert", "고급 재료와 정교한 조리법으로 완성되어 입 안 가득 퍼지는 향긋한 맛이 자랑인 디저트"));
        return menuList;
    }

    public Map<String, ArrayList<Product>> productMap() {
        ArrayList<Menu> menuList = menuList();
        Map<String, ArrayList<Product>> productMap = new HashMap<>(); // 전체 메뉴
        // 커피 메뉴
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ 아메리카노", "최상의 원두로 내린 아메리카노", 1500));
        products.add(new Product("ㅡㅡ헤이즐넛 아메리카노", "헤이즐넛 시럽을 넣은 아메리카노", 2500));
        products.add(new Product("ㅡㅡㅡ바닐라 아메리카노", "바닐라 시럽을 넣은 아메리카노", 2500));
        products.add(new Product("ㅡㅡㅡㅡㅡ 꿀아메리카노", "신선한 꿀을 넣은 아메리카노", 2500));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ 메가리카노", "메가커피 시그니쳐 빅!사이즈 아메리카노", 3000));
        products.add(new Product("ㅡㅡㅡㅡ카라멜 마끼야또", "에스프레소에 달콤한 카라멜", 3700));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 카페모카", "초코를 만나 풍부해진 에스프레소와 고소한 우유", 3900));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 콜드브루", "찬물 또는 상온의 물을 사용하여 장시간 추출한 커피", 3300));
        products.add(new Product("ㅡㅡㅡㅡㅡ콜드브루 라떼", "콜드브루에 신선한 우유를 넣어 크리미한 커피", 3800));
        productMap.put(menuList().get(0).getMenuName(), products);

        // 라떼 메뉴
        products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ카페라떼", "에스프레소와 부드러운 우유", 2200));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ카푸치노", "에스프레소 위에 올려진 우유거품, 그리고 시나몬 파우더", 2700));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ바닐라라떼", "바닐라의 풍부한 향과 라떼의 조화", 3400));
        products.add(new Product("ㅡㅡㅡㅡㅡ헤이즐넛라떼", "헤이즐넛의 풍부한 향과 라떼의 조화", 3400));
        products.add(new Product("ㅡㅡㅡㅡㅡ티라미수라떼", "에스프레소와 티라미수 소스 & 우유", 3900));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ딸기라떼", "산뜻하고 달콤한 딸기와 부드러운 우유", 3700));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ고구마라떼", "달콤하고 고소한 고구마와 부드러운 우유", 3500));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ곡물라떼", "우유에 곡물을 더해 고소하고 든든", 3000));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ토피넛라떼", "은은하게 퍼지는 카라멜의 달달한 향기와 견과의 고소함", 3800));
        products.add(new Product("ㅡㅡ 흑당버블밀크티라떼", "타바론 얼그레이 홍차의 깊은 맛을 살린 밀크티 라떼와 진한 흑당", 3800));
        productMap.put(menuList().get(1).getMenuName(), products);

        // 초코 메뉴
        products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡㅡ핫초코/아이스초코", "부드러운 우유에 진한 초코 소스", 3500));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ메가초코", "부드러운 우유와 진한 초코소스, 달콤한 휘핑크림", 3800));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ오레오초코", "진한 초코와 리얼 오레오를 블렌딩", 3900));
        productMap.put(menuList().get(2).getMenuName(), products);

        // 에이드 & 모히또 메뉴
        products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 체리콕", "신선한 체리와 새콤한 체리시럽, 콜라", 3300));
        products.add(new Product("ㅡㅡㅡㅡㅡ자몽 에이드", "향긋한 자몽 시럽을 넣은 에이드", 3500));
        products.add(new Product("ㅡㅡㅡㅡㅡ레몬 에이드", "새콤한 레몬 시럽을 넣은 에이드", 3500));
        products.add(new Product("ㅡㅡㅡ블루레몬 에이드", "새콤달콤한 블루레몬 시럽을 넣은 에이드", 3500));
        products.add(new Product("ㅡㅡㅡㅡ청포도 에이드", "상큼한 청포도의 과육이 돋보이는 에이드", 3500));
        products.add(new Product("ㅡㅡㅡㅡㅡ라임 모히또", "라임향이 돋보이는 노알콜 모히또", 3800));
        products.add(new Product("ㅡㅡㅡㅡ청포도 모히또", "청포도향과 함께 하는 노알콜 모히또", 3800));
        products.add(new Product("ㅡㅡㅡㅡㅡ자몽 모히또", "자몽향과 함께 하는 노알콜 모히또", 3800));
        productMap.put(menuList().get(3).getMenuName(), products);

        // 스무디 & 프라페 메뉴
        products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡ트러플용과 티플레저", "상큼 달콤한 트로피컬 과일, 강렬한 레드 용과와 아삭한 알로에겔", 4800));
        products.add(new Product("ㅡㅡㅡ코코넛커피 스무디", "바삭하고 고소한 코코넛칩을 올려 쌉싸름한 커피와 달코한 코코넛의 조화", 3900));
        products.add(new Product("ㅡㅡㅡㅡ수박화채 스무디", "달달하고 청량한 수박 스무디 위로 다채로운 과일", 4100));
        products.add(new Product("ㅡㅡㅡㅡ 딸기쿠키프라페", "부드러운 바닐라와 달달한 딸기, 바삭한 오레오 쿠키", 3900));
        products.add(new Product("ㅡ스모어블랙쿠키 프라페", "진한 초코스무디에 바삭한 쿠키와 퐁신퐁신한 마시멜로우 잼", 3900));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ 쿠키프라페", "바삭하고 달콤한 오레오와 우유, 부드러운 바닐라향", 3900));
        productMap.put(menuList().get(4).getMenuName(), products);

        // 티 & 주스
        products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ 녹차", "향긋하고 부드러운 녹차", 2500));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 얼그레이", "은은한 향의 홍차", 2500));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 캐모마일", "심신이 안정되는 캐모마일", 2500));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 페퍼민트", "시원한 향의 페퍼민트", 2500));
        products.add(new Product("ㅡㅡㅡㅡ복숭아 아이스티", "새콤달콤고 시원한 복숭아 아이스티", 3000));
        products.add(new Product("ㅡㅡㅡㅡㅡ유자/레몬/자몽", "과일 향이 은은하게 올라오는 차", 3300));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 딸기주스", "새콤달콤한 딸기주스에 건강한 피쉬 콜라겐", 4000));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ 수박주스", "돌아온 여름시즌 베스트셀러", 4000));
        products.add(new Product("ㅡㅡ레드오렌지자몽주스", "시칠리아 레드오렌지와 자몽에 프로바이오틱스", 4000));
        products.add(new Product("ㅡㅡ샤인머스캣 그린주스", "달콤한 샤인머스캑과 케일이 만난 싱그러운 주스에 칼슘", 4000));
        products.add(new Product("ㅡㅡㅡㅡ딸기바나나주스", "상큼한 딸기 부드러운 바나나", 14000));
        productMap.put(menuList().get(5).getMenuName(), products);

        // 디저트
        products = new ArrayList<Product>();
        products.add(new Product("ㅡㅡ크렌베리아몬드 쿠키", "3가지 다양한 맛의 갓 구운 쿠키", 2900));
        products.add(new Product("ㅡㅡㅡㅡ모카초코칩 쿠키", "3가지 다양한 맛의 갓 구운 쿠키", 2900));
        products.add(new Product("ㅡㅡㅡㅡ더블초코칩 쿠키", "3가지 다양한 맛의 갓 구운 쿠키", 2900));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡ치즈 케익", "3가지 다양한 맛의 당일 만든 부드러운 케익", 3300));
        products.add(new Product("ㅡㅡㅡㅡㅡ초코무스 케익", "3가지 다양한 맛의 당일 만든 부드러운 케익", 3300));
        products.add(new Product("ㅡㅡㅡㅡ치티라미수 케익", "3가지 다양한 맛의 당일 만든 부드러운 케익", 3300));
        products.add(new Product("ㅡㅡㅡ쿠키/카라멜 크로넛", "당일 만든 겉은 바삭하고 속은 부드러운 크로넛", 3800));
        products.add(new Product("ㅡㅡㅡㅡㅡ 잉글리시머핀", "햄,치즈,머핀의 3가지 사기조합", 3300));
        products.add(new Product("ㅡㅡㅡㅡㅡ 갈릭바게트볼", "바게트 볼 속에 진한 갈릭향의 소스", 4300));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ크로크무슈", "햄, 세가지 치즈 특별 비법 소스가 더해진 크로크무슈", 3800));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡㅡㅡ 핫도그", "폭신한 빵과 육즙 터지는 소시지", 2200));
        products.add(new Product("ㅡㅡㅡㅡㅡㅡ 허니브레드", "폭신한 빵에 휘핑크림과 특제 허니소스", 4500));
        products.add(new Product("ㅡㅡㅡㅡ 딸기 생크림와플", "3가지 다양한 맛의 겉바속촉 와플", 3500));
        products.add(new Product("ㅡㅡㅡㅡ 사과 생크림와플", "3가지 다양한 맛의 겉바속촉 와플", 3500));
        products.add(new Product("ㅡㅡㅡ 오레오 생크림와플", "3가지 다양한 맛의 겉바속촉 와플", 3500));
        products.add(new Product("ㅡㅡㅡㅡㅡ 플레인베이글", "커피의 영원한 단짝 베이글", 2000));
        products.add(new Product("ㅡㅡㅡ 쿠키프라페 마카롱", "3가지 다양한 맛의 달콤한 마카롱", 1800));
        products.add(new Product("ㅡㅡㅡㅡ 퐁크러쉬 마카롱", "3가지 다양한 맛의 달콤한 마카롱", 1800));
        products.add(new Product("ㅡㅡ 유니콘프라페 마카롱", "3가지 다양한 맛의 달콤한 마카롱", 1800));
        productMap.put(menuList().get(6).getMenuName(), products);

        return productMap;
    }
}

class EachMenuBuilder {
    MenuCollection menuCollection = new MenuCollection();
    Kiosk kiosk = new Kiosk();
    Scanner sc = new Scanner(System.in);

    public void buildEachMenu(int orderNumber) {
        if (orderNumber <= menuCollection.menuList().size() && orderNumber >= 1) {
            String menuName = menuCollection.menuList().get(orderNumber - 1).getMenuName();
            menuCollection.menuBar(menuName);

            System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
            int menuNumber = 1;
            for (Product product : menuCollection.productMap().get(menuName)) {
                System.out.println("| " + menuNumber +". "+ product.toString());
                menuNumber++;
            }
            System.out.println("+---------------------------------------------------------------------------------------------------------------------------");
            kiosk.orderMenu(menuNumber);
            System.out.print("숫자를 눌러 메뉴를 선택해주세요. : ");
            int check = sc.nextInt();
            kiosk.checkMenuOrder(menuName, check);
        } else if (orderNumber == menuCollection.menuList().size() + 1) { // 메뉴 개수 + 1 누르면 장바구니 확인
            kiosk.shoppingCart();
        } else if (orderNumber == menuCollection.menuList().size() + 2) { // 메뉴 개수 + 2 누르면 장바구니 초기화
            kiosk.rebootShoppingCart();
        } else if (orderNumber == 0) { // 0 누르면 총 매출액 확인
            kiosk.printTotal();
        } else {
            System.out.println("다시 입력해주세요");
        }
    }
}