import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    Menu menu = new Menu();
    Food food = new Food();
    ArrayList<Food> allFood = new ArrayList<>();
    Order order = new Order();

    public void showMainMenu() {
        System.out.println();
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[SHACKESHACK MENU]");
        menu.introMenu(1,"Burgers","앵거스 비프 통살을 다져만든 버거");
        menu.introMenu(2,"Forzen Custard","매장에서 신선하게 만드는 아이스크림");
        menu.introMenu(3,"Drinks","매장에서 직접 만드는 음료");
        menu.introMenu(4,"Beer","뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println();
        System.out.println("[ORDER MENU]");
        menu.introMenu(5, "Order", "장바구니를 확인 후 주문합니다.");
        menu.introMenu(6, "Cancel", "진행중인 주문을 취소합니다.");
    }

    public void showBurger() {
        System.out.println();
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[Burgers MENU]");
        food.introFood(1, "ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        food.introFood(2, "SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        food.introFood(3, "Shroom Burger", 9400, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
    }

    public void showFrozenCustard() {
        System.out.println();
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[Frozen Custard MENU]");
        food.introFood(1, "Red Bean Shake", 6500, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
        food.introFood(2, "Shake of the Week", 6500, "특별한 커스터드 플레이버");
        food.introFood(3, "Shakes", 5900, "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피");
    }

    public void showDrinks() {
        System.out.println();
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[Drinks MENU]");
        food.introFood(1, "Abita Root Beer", 4400, "청량감 있는 독특한 미국식 무알콜 탄산음료");
        food.introFood(2, "Bottled Water", 1000, "지리산 암반대수층으로 만든 프리미엄 생수");
    }

    public void showBeer() {
        System.out.println();
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[Beer MENU]");
        food.introFood(1, "ShackMeister Ale", 9800, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
        food.introFood(2, "Magpie Brewing Co.", 6800, ".");
    }

    public void addBasketQuestion() {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }

    public void addToBasket(ArrayList<Food> basket, Method method) {
        String name = "";
        for (Food b: basket) {
            name = b.getFood();
        }
        System.out.println(name + "가 장바구니에 추가되었습니다.");
        System.out.println();
        method.showMainMenu();
    }

    public void chooseBurger(Method method, ArrayList<Food> basket, Scanner sc) {
        method.showBurger();
        int choose2 = sc.nextInt();

        if (choose2 == 1) {
            food.introFood(1, "ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            method.addBasketQuestion();
            int choose3 = sc.nextInt();
            if (choose3 == 1) {
                basket.add(new Food(1, "ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                method.addToBasket(basket, method);
            } else if (choose3 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else if (choose2 == 2) {
            food.introFood(2, "SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            method.addBasketQuestion();
            int choose3 = sc.nextInt();
            if (choose3 == 1) {
                basket.add(new Food(2, "SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                method.addToBasket(basket, method);
            } else if (choose3 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else if (choose2 == 3) {
            food.introFood(3, "Shroom Burger", 9400, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
            method.addBasketQuestion();
            int choose3 = sc.nextInt();
            if (choose3 == 1) {
                basket.add(new Food(3, "Shroom Burger", 9400, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
                method.addToBasket(basket, method);
            } else if (choose3 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
            method.showMainMenu();
        }
    }

    public void chooseFrozenCustard(Method method, ArrayList<Food> basket, Scanner sc) {
        method.showFrozenCustard();

        int choose6 = sc.nextInt();
        if (choose6 == 1) {
            food.introFood(1, "Red Bean Shake", 6500, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
            method.addBasketQuestion();
            int choose7 = sc.nextInt();
            if (choose7 == 1) {
                basket.add(new Food(1, "Red Bean Shake", 6500, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"));
                method.addToBasket(basket, method);
            } else if (choose7 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else if (choose6 == 2) {
            food.introFood(2, "Shake of the Week", 6500, "특별한 커스터드 플레이버");
            method.addBasketQuestion();
            int choose8 = sc.nextInt();
            if (choose8 == 1) {
                basket.add(new Food(2, "Shake of the Week", 6500, "특별한 커스터드 플레이버"));
                method.addToBasket(basket, method);
            } else if (choose8 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else if (choose6 == 3) {
            food.introFood(3, "Shakes", 5900, "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피");
            method.addBasketQuestion();
            int choose9 = sc.nextInt();
            if (choose9 == 1) {
                basket.add(new Food(3, "Shakes", 5900, "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"));
                method.addToBasket(basket, method);
            } else if (choose9 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
            method.showMainMenu();
        }
    }

    public void chooseDrinks(Method method, ArrayList<Food> basket, Scanner sc) {
        method.showDrinks();

        int choose10 = sc.nextInt();
        if (choose10 == 1) {
            food.introFood(1, "Abita Root Beer", 4400, "청량감 있는 독특한 미국식 무알콜 탄산음료");
            method.addBasketQuestion();
            int choose7 = sc.nextInt();
            if (choose7 == 1) {
                basket.add(new Food(1, "Abita Root Beer", 4400, "청량감 있는 독특한 미국식 무알콜 탄산음료"));
                method.addToBasket(basket, method);
            } else if (choose7 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else if (choose10 == 2) {
            food.introFood(2, "Bottled Water", 1000, "지리산 암반대수층으로 만든 프리미엄 생수");
            method.addBasketQuestion();
            int choose8 = sc.nextInt();
            if (choose8 == 1) {
                basket.add(new Food(2, "Bottled Water", 1000, "지리산 암반대수층으로 만든 프리미엄 생수"));
                method.addToBasket(basket, method);
            } else if (choose8 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
            method.showMainMenu();
        }
    }

    public void chooseBeer(Method method, ArrayList<Food> basket, Scanner sc) {
        method.showBeer();

        int choose11 = sc.nextInt();
        if (choose11 == 1) {
            food.introFood(1, "ShackMeister Ale", 9800, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
            method.addBasketQuestion();
            int choose7 = sc.nextInt();
            if (choose7 == 1) {
                basket.add(new Food(1, "ShackMeister Ale", 9800, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"));
                method.addToBasket(basket, method);
            } else if (choose7 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else if (choose11 == 2) {
            food.introFood(2, "Magpie Brewing Co.", 6800, ".");
            method.addBasketQuestion();
            int choose8 = sc.nextInt();
            if (choose8 == 1) {
                basket.add(new Food(2, "Magpie Brewing Co.", 6800, "."));
                method.addToBasket(basket, method);
            } else if (choose8 == 2) {
                method.showMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.");
                method.showMainMenu();
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
            method.showMainMenu();
        }
    }
}
