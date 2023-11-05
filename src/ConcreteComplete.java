import java.util.ArrayList;
import java.util.List;

public class ConcreteComplete implements IComplete {
    private List<Customer> customers = new ArrayList<>();
    private String newsS;

    public void setNews(String news) {
        this.newsS = news;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(this, newsS);
        }
    }
}
