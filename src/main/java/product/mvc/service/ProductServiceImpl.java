package product.mvc.service;

import product.mvc.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Wedding Dress", "Violet", 1500000));
        products.put(2, new Product(2,"Legend Bridal", "Black", 2500000));
        products.put(3, new Product(3,"Classic Bridal", "Red", 2000000));
        products.put(4, new Product(4,"Modern Dress", "White", 1000000));
        products.put(5, new Product(5,"New Wedding Dress", "Orange", 2200000));
        products.put(6, new Product(6,"Dream Bridal", "Pink", 1100000));
    }


    @Override
    public List<Product> showAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product searchById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
