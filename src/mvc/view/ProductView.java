package mvc.view;

import java.util.Scanner;

import mvc.controller.ProductController;
import mvc.model.Product;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);

    public void showAllProducts(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    private static Product inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm :");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm :");
        double price = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(id, name, price);
        scanner.close();
        return newProduct;
    }

    private static int inputProductId() {
        System.out.print("Nhập id sản phẩm :");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ProductView view = new ProductView();
        // ProductModel model = new ProductModel();
        ProductController controller = new ProductController();
        boolean flag = false;
        int selected;
        String mess;
        do {
            System.out.println("Quản lý sản phầm ");
            System.out.println("1. Hiển thị danh sách sản phẩm ");
            System.out.println("2. Thêm sản phẩm mới ");
            System.out.println("3. Thay đổi thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm khỏi hệ thống ");
            System.out.println("5. Thoát ");
            System.out.print("Chọn tác vụ : ");
            selected = Integer.parseInt(scanner.nextLine());
            switch (selected) {
            case 1:
                Product[] products = controller.getAllProducts();
                view.showAllProducts(products);
                break;
            case 2:
                Product newProduct = inputProduct();
                mess = controller.add(newProduct);
                System.out.println(mess);
                break;
            case 3:

                break;
            case 4:
                int id = inputProductId();
                mess = controller.remove(id);
                System.out.println(mess);
                break;
            case 5:
                flag = true;
                break;
            }

        } while (!flag);
    }

}
