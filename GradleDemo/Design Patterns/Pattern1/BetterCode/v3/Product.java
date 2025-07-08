package BetterCode.v3;

import java.util.HashMap;
import java.util.List;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private String createdAt;
    private String updatedAt;
    private int discount;
    private List<String> images;

    Product(Builder builder) {
        if (builder.getPrice() > 0){
            this.price = builder.getPrice();
        }


    }
}
