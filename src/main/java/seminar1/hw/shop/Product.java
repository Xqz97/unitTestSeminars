package seminar1.hw.shop;

public class Product {
    private Integer price; // Стоимость продукта
    private String name; // Название

    public Product( String name, Integer price) {
        this.price = price;
        this.name = name;
    }

    // Геттеры, сеттеры:
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}