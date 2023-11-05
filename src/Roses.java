public class Roses implements IFlowers {
    @Override
    public double cost()
    {
        return 6000.0;
    }

    @Override
    public String getDescription() {
        return "розы, ";
    }
}
