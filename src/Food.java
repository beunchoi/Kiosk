public class Food extends Menu{
    int price;


    public Food(int number, String food, int price, String foodIntro) {
        super(number, food, foodIntro);
        this.price = price;
    }
    public Food() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return food + " / " + price + " / " + foodIntro;
    }

    public void introFood(int number, String food, int price, String foodIntro) {
        System.out.println(number + ". " + food + " / " + price + " / " + foodIntro);
    }



}
