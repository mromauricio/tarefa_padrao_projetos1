package application;

public class Order {
    private String model;
    private String category;

    public Order(String model, String category) {
        this.model = model;
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }
}
