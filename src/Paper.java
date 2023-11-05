public class Paper extends WrapperDecorator {
    @Override
    public double cost()
    {
        return super.cost() + 1000.0;
    }

    public Paper(IFlowers flowers)
    {
        super(flowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "бумага, ";
    }
}
