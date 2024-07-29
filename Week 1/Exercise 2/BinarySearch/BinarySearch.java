import java.util.Arrays;
import java.util.Comparator;


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

public class BinarySearch {
    public static Product binarySearch(Product[] products, int targetProductId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetProductId) {
                return products[mid];
            } else if (products[mid].productId < targetProductId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Product A", "Category 1"),
                new Product(2, "Product B", "Category 2"),
                new Product(3, "Product C", "Category 3"),
                new Product(4, "Product D", "Category 4")
        };

        // Sort products by productId for binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int targetProductId = 3;
        Product result = binarySearch(products, targetProductId);

        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found");
        }
    }
}
