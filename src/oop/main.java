package oop;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {

        Technology p1=new Technology("Iphone 13 pro max","35.000TL","Phone","MidNight Blue");
        Supply p2=new Supply("Pirinç","10TL","Baklagil","03.04.2033");
        Product p=new Product("a","25");
        ArrayList<Product> productList=new ArrayList<Product>();
        ArrayList<Technology> techList=new ArrayList<Technology>();
        ArrayList<Supply> supList=new ArrayList<Supply>();

        productList.add(p);

        Emplooye e=new Emplooye(productList);

        Product pUpdated=new Product("a","2500");
        e.read();
        e.update(pUpdated,"a");

        System.out.println(p.getPrice());

        System.out.println("Total Product Size is: "+Product.PRODUCT_SIZE);
        System.out.println("Total Technology Product is: "+Technology.TECH_SIZE);
        System.out.println("Total Suplly Product is: "+Supply.SUP_SIZE);






    }
}