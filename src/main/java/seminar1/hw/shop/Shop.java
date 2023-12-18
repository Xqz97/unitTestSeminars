package seminar1.hw.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class Shop {
        private List<Product> products;

        public Shop() {
            products = new ArrayList<>();
        }

        // Метод для сортировки списка продуктов по стоимости
        public void sortProductsByPrice() {
            Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
        }

        // Метод для получения самого дорогого продукта
        public Product getMostExpensiveProduct() {
            if (products.isEmpty()) {
                return null;
            }
            return Collections.max(products, Comparator.comparingDouble(Product::getPrice));
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public List<Product> getProducts() {
            return products;
        }
    }