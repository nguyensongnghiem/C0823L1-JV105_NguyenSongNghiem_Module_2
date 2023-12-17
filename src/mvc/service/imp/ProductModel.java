package mvc.service.imp;

import mvc.model.Product;
import mvc.repository.imp.ProductDb;
import mvc.service.IProductModel;

public class ProductModel implements IProductModel {
    private ProductDb productDb = new ProductDb();

    @Override
    public String add(Product product) {
        if (productDb.findProductIndex(product) == -1) {
            productDb.add(product);
            return "Đã thêm sản phẩm thành công !";
        } else
            return "Sản phẩm đã có trên hệ thống !";
    }

    @Override
    public String remove(int id) {
        if (productDb.findProductById(id) != null) {
            productDb.remove(id);
            return "Đã xóa sản phẩm thành công !";
        } else
            return "Sản phẩm không có trên hệ thống !";
    }

    @Override
    public Product findProductById(int id) {
        return productDb.findProductById(id);
    }

    @Override
    public Product[] getAllProducts() {
        return productDb.getAllProducts();
    }

    @Override
    public String update(Product product) {
        if (productDb.findProductIndex(product) != -1) {
            productDb.update(product);
            return "Đã cập nhật thông tin sản phẩm thành công !";
        } else
            return "Sản phẩm không có trên hệ thống !";
    }

}
