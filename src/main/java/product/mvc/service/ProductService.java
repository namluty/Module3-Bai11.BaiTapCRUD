package product.mvc.service;

import product.mvc.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> showAll();
    void save(Product product);
    Product searchById(int id);
    void update(int id, Product product);
    void remove(int id);
}
