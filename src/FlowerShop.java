public class FlowerShop {
    private static FlowerShop instance;

    private FlowerShop() {

    }

    public static FlowerShop getInstance() {
        if (instance == null) {
            instance = new FlowerShop();
        }
        return instance;
    }

    public void welcomeToTheShop() {
        System.out.println("Добро пожаловать в наш магазин!");
    }
}
