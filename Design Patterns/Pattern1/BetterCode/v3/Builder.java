package BetterCode.v3;

import java.util.List;

public class Builder {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private String createdAt;
    private String updatedAt;
    private int discount;
    private List<String> images;

    Builder() {
    }
    public String getName(){
        return this.name;
    }

    public List<String> getImages() {
        return images;
    }

    public int getPrice() {
        return price;
    }

    public void set (String name){
            this.name = name;
        }

        public void setDesc (String desc){
            this.desc = desc;
        }

        public void setPrice ( int price){
            this.price = price;
        }

        public void setDiscount ( int discount){
            this.discount = discount;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        public void setCategory (String category){
            this.category = category;
        }

        public void setCreatedAt (String createdAt){
            this.createdAt = createdAt;
        }

        public void setUpdatedAt (String updatedAt){
            this.updatedAt = updatedAt;
        }

        public void setImages (List < String > images) {
            this.images = images;
        }
    }