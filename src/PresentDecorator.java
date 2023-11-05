public abstract class PresentDecorator implements IFlowers {
    IFlowers flowers;

    public PresentDecorator(IFlowers flowers) {
        this.flowers = flowers;
    }

    public double cost() {
        return flowers.cost();
    }

    public String addPresent() {
        return "дополнительно: ";
    }

    @Override
    public String getDescription() {
        return flowers.getDescription() + addPresent();
    }
}
