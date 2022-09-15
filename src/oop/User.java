package oop;

import java.util.ArrayList;

public class User implements UserProductProcess<Product>{



    private int id;
    private String name;
    private String budget;

    User(int id,String name,String budget){
        this.budget=budget;
        this.id=id;
        this.name=name;
    }
    User(int id,String name){
        this.id=id;
        this.name=name;
    }


    @Override
    public void buy(Product product) {
        System.out.println("product received: "+product.getName());

        try{
            int number = Integer.parseInt(budget);
           int productnumber=Integer.parseInt(product.getPrice());
            System.out.println("your budget is: "+number+"TL");
            if (number>productnumber) {
                number = number - productnumber;
                System.out.println("remaining budget: "+number+"TL");
            }
            else {
                System.out.println("budget is NOT enough");
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void buyback(Product product) {

        System.out.println("ürün iade edildi");

    }
}
