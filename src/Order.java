public class Order {
    private DeliveryStrategy deliveryStrategy;

    public Order (DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public int totalCost() {
        int deliveryCost = deliveryStrategy.deliveryCost();
        return deliveryCost;
    }
}
