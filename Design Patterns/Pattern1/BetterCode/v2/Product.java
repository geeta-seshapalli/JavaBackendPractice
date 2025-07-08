package BetterCode.v2;

import java.util.ArrayList;
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

    Product(HashMap<String,Object> mp) {
        if (mp.get("price").equals(0)){
            this.price = (int)mp.get("price");
        }
    }
}
