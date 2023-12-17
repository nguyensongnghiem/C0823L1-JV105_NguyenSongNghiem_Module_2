package mvc.controller;

import mvc.model.Product;
import mvc.service.IProductModel;
import mvc.service.imp.ProductModel;

public class ProductController {
    private IProductModel model = new ProductModel();
        
    public ProductController() {
    }
    public ProductController(IProductModel model) {
        this.model = model;
    }
    public String add(Product product) {
        return model.add(product);
    }
    public String update(Product product){
        return model.update(product);

    }
    public String remove(int id) {
        return model.remove(id);
    }
    public Product[] getAllProducts() {
        return model.getAllProducts();
    };

}
