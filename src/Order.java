import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public void orderBoard(ArrayList<Food> basket) {
        int totalPrice = 0;

        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[Orders]");
        for (Food a : basket) {
            System.out.println(a.toString());
        }
        System.out.println();
        System.out.println("[Total]");
        for (Food a : basket) {
            totalPrice += a.getPrice();
        }
        System.out.println(totalPrice);
        System.out.println();
        System.out.println("1. 주문    2. 다시 주문하기");
    }

    public void ordering(Method method, Order order, ArrayList<Food> basket, Scanner sc) {
        order.orderBoard(basket);
        int finish = sc.nextInt();
        if (finish == 1 && !basket.isEmpty()) {
            basket.clear();
            order.orderFinish(method);
        } else if (finish == 1 && basket.isEmpty()) {
            System.out.println("주문할 수 없습니다.");
            method.showMainMenu();
        } else if (finish == 2) {
            basket.clear();
            method.showMainMenu();
        }
    }

    public void orderFinish(Method method) {
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.println("대기번호는 [1]번 입니다.");
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
        }
        method.showMainMenu();
    }

    public void orderCancel() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }

    public void canceling(Method method, Order order,ArrayList<Food> basket, Scanner sc) {
        order.orderCancel();
        int cancel = sc.nextInt();
        if(cancel == 1) {
            basket.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            System.out.println();
            method.showMainMenu();
        }
        else if(cancel == 2) {
            method.showMainMenu();
        }
    }
}
