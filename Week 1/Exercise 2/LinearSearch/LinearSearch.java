class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
public class LinearSearch {
    public static Product linearSearch(Product[] products, int targetProductId) {
        for (Product product : products) {
            if (product.productId == targetProductId) {
                return product;
            }
        }
        return null;
    }
}
