package oop;

public class Product {
    private String name;
    private String price;
    final int maxStock=300;


    public static int PRODUCT_SIZE=0;
     Product(String name, String price){
        this.name=name;
        this.price=price;
        PRODUCT_SIZE++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        if(price>(price/2)){
        this.price = price;
        }

        else{System.out.println("you cant set the price less than %50")}

    }

    public static int getProductSize() {
        return PRODUCT_SIZE;
    }

    public static void setProductSize(int productSize) {
        PRODUCT_SIZE = productSize;
    }
}


