public class Letter extends PresentDecorator {
    @Override
    public double cost()
    {
        return super.cost() + 200.0;
    }

    public Letter(IFlowers flowers)
    {
        super(flowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "записка";
    }
}
