package mvc.repository;

import mvc.model.Product;

public interface IProductDb {
    public Product[] getAllProducts();
    public void add(Product product);
    public void remove(int id);
    public void update(Product product);
    public Product findProductById(int id);    
    public int findProductIndex(Product product);

}
