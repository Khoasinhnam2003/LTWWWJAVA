package iuh.fit.se.daos;

import iuh.fit.se.entities.Product;

import java.util.List;

public interface ProductDAO {
    public Product getById(int id);
    public List<Product> findAll();
    public void addProduct(Product p);
}
