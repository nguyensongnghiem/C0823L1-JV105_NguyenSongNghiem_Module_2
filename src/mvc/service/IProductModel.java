package mvc.service;

import mvc.model.Product;
public interface IProductModel {
    String add(Product product);
    String remove(int id);
    String update(Product product);
    Product findProductById(int id);
    Product[] getAllProducts();
}
