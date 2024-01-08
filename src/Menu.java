public class Menu {
    int number;
    String food;
    String foodIntro;

    public Menu(int number, String food, String foodIntro) {
        this.number = number;
        this.food = food;
        this.foodIntro = foodIntro;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFoodIntro() {
        return foodIntro;
    }

    public void setFoodIntro(String foodIntro) {
        this.foodIntro = foodIntro;
    }

    public Menu() {

    }

    public void introMenu(int number, String food, String foodIntro) {
        System.out.println(number + ". " + food + " / " + foodIntro);
    }
}
