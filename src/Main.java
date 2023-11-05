import java.util.List;

public class Main {
    public static void main(String[] args) {
        // тут проверили что экземпляр создается System.out.println(FlowerShop.getInstance());
        FlowerShop.getInstance().welcomeToTheShop();

        // декоратор паттерн
        IFlowers flowers = new Postcard(new Box(new Eustoma()));
        System.out.println("Заказ: " + flowers.getDescription());
        System.out.println(flowers.cost());

        // стратегия паттерн
        DeliveryStrategy pickup = new Pickup();
        DeliveryStrategy courier = new Courier();

        Order order = new Order(courier);
        int totalCost1 = order.totalCost();
        System.out.println("доставка +" + totalCost1 + ". итого: " + (flowers.cost() + totalCost1));

        // обсервер паттерн
        ConcreteComplete complete = new ConcreteComplete();
        complete.setNews(", ваш заказ готов!");

        Customer customer1 = new Customer("Саня");
        complete.addCustomer(customer1);
        complete.notifyCustomers();

        // адаптер паттерн
        Florista florista = new Florista();
        IProfessional adaptedFlorista = new FloAdapter(florista);

        String description = adaptedFlorista.getInfo();
        System.out.println(description);

        // фактори паттерн
        BonusFactory bonusFactory = new BonusFactory();
        IBonus selectedBonus = bonusFactory.createBonus("Скидочка");
        selectedBonus.presentBonus();
    }
}