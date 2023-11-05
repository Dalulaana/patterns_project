public class Discount implements IBonus {
    @Override
    public void presentBonus() {
        System.out.println("Вы получаете скидку 15% на следующий заказ!");
    }
}
