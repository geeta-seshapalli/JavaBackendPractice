package BetterCode.v3;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setBrand("Apple");
        builder.setDiscount(10);

    Product p = new Product(builder );
    }
}
