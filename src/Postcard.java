public class Postcard extends PresentDecorator {
    @Override
    public double cost()
    {
        return super.cost() + 400.0;
    }

    public Postcard(IFlowers flowers)
    {
        super(flowers);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "открытка";
    }
}
