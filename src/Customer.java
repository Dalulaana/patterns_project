public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    void update(IComplete complete, String news) {
        System.out.println(name + news);
    }
}
