import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {
    public void a() {
        Menu menu = new Menu();
        Method method = new Method();
        Food food = new Food();
        Scanner sc = new Scanner(System.in);
        ArrayList<Food> basket = new ArrayList<>();
        Order order = new Order();


        method.showMainMenu();
        while (true) {
            int choose1 = sc.nextInt();
            switch (choose1) {
                case 1:
                    method.chooseBurger(method, basket, sc);
                    break;
                case 2:
                    method.chooseFrozenCustard(method, basket, sc);
                    break;
                case 3:
                    method.chooseDrinks(method, basket, sc);
                    break;
                case 4:
                    method.chooseBeer(method, basket, sc);
                    break;
                case 5:
                    order.ordering(method, order, basket, sc);
                    break;
                case 6:
                    order.canceling(method, order, basket, sc);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    method.showMainMenu();
            }
        }
    }
}


