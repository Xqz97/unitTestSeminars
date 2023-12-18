package seminar1Test;

import seminar1.hw.shop.Product;
import seminar1.hw.shop.Shop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ShopTest {
    private Shop shop;

    @Before
    public void setUp() {
        shop = new Shop();
        shop.addProduct(new Product("Product A", 15));
        shop.addProduct(new Product("Product B", 20));
        shop.addProduct(new Product("Product C", 10));
    }

    @Test
    public void testSortProductsByPrice() {
        shop.sortProductsByPrice(); // Сортировка продуктов по стоимости
        List<Product> sortedProducts = shop.getProducts();

        Assert.assertEquals("Product C", sortedProducts.get(0).getName()); // Проверка, что самый дешевый продукт на первом месте
        Assert.assertEquals("Product A", sortedProducts.get(1).getName());
        Assert.assertEquals("Product B", sortedProducts.get(2).getName()); // Проверка, что самый дорогой продукт на последнем месте
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        Assert.assertEquals("Product B", mostExpensiveProduct.getName()); // Проверка, что самый дорогой продукт имеет правильное имя
        Assert.assertEquals(20.0, mostExpensiveProduct.getPrice(), 0.0); // Проверка, что самый дорогой продукт имеет правильную цену
    }
}