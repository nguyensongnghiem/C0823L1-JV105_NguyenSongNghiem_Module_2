package mvc.repository.imp;

import mvc.model.Product;
import mvc.repository.IProductDb;

public class ProductDb implements IProductDb {
    private static Product[] products = new Product[10];
    static {
        products[0] = new Product(1, "fish", 100);
        products[1] = new Product(2, "car", 10000);
        products[2] = new Product(3, "laptop", 500);
        products[2] = new Product(4, "iPhone", 300);
    }

    @Override
    public void add(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }

    }

    @Override
    public Product findProductById(int id) {
        Product foundProduct = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == id) {
                foundProduct = products[i];
                break;
            }
        }
        return foundProduct;
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId()==id) {
                for (int j = i; j < products.length-1; j++) {
                    products[j]= products[j+1];
                }
                products[products.length-1] = null;
                break;
            }
            
        }
    }

    @Override
    public void update(Product product) {
        int index = findProductIndex(product);
        if (index != -1) {
            products[index].setName(product.getName());
            products[index].setPrice(product.getPrice());
        }
    }

    @Override
    public Product[] getAllProducts() {
        return products;
    }

    @Override
    public int findProductIndex(Product product) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == product.getId()) {
                index = i;
                break;
            }
        }
        return index;
    }

}
