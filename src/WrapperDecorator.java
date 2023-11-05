public abstract class WrapperDecorator implements IFlowers {
    IFlowers flowers;

    public WrapperDecorator(IFlowers flowers) {
        this.flowers = flowers;
    }

    public double cost() {
        return flowers.cost();
    }

    public String addWrapper() {
        return "завернуты в: ";
    }

    @Override
    public String getDescription() {
        return flowers.getDescription() + addWrapper();
    }
}
