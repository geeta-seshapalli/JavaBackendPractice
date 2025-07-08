package ProblematicCode;

import java.util.*;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private String createdAt;
    private String updatedAt;
    private int discount;
    private List <String> images;

    Product(String name, String desc, int price, String brand, String category,
    String createdAt, String updatedAt, int discount, ArrayList<String> images){
        this.name = name;
        this.desc =  desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.discount = discount;
        this.images = images;

    }
}
