package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class main{
    public static void main(String[] args) {

        Technology p1=new Technology("Iphone 13 pro max","35000","Phone","MidNight Blue");
        Supply p2=new Supply("Pirinç","10","Baklagil","03.04.2033");
        Product p=new Product("a","25");
        User u1=new User(1,"hasan","50");
        User u2=new User(2,"mehmet","5000");
        // 2.constructer çalışıcak
        User u3=new User(3,"ömer");


        ArrayList<Technology> techList=new ArrayList<Technology>();
        ArrayList<Supply> supList=new ArrayList<Supply>();
        ArrayList<Product> productList= new ArrayList<Product>();
        ArrayList<User> userList=new ArrayList<User>();
            if(Product.PRODUCT_SIZE<p.maxStock) {
                productList.add(p);
                techList.add(p1);
                productList.add(p2);
                userList.add(u1);
                userList.add(u3);
            }
            else{
                System.out.println("daha fazla ürün ");
            }
        Emplooye e=new Emplooye(productList,userList);

        Product pUpdated=new Product("a","2500");
        Product p1Updated=new Product("Pirinç","12");
        e.read();
        e.update(pUpdated,"a");
        e.update(p1Updated,"Pirinç");
        e.getUsersById(0);

        System.out.println(p.getPrice());
        System.out.println(p2.getPrice());


        System.out.println("Total Product Size is: "+(Product.PRODUCT_SIZE));
        System.out.println("Total Technology Product is: "+Technology.TECH_SIZE);
        System.out.println("Total Suplly Product is: "+Supply.SUP_SIZE);
        u1.buy(p2);
        int p2Index= productList.indexOf(p2);
        productList.remove(p2Index);

        productList.stream().forEach(item->{
            System.out.println(item.getName());
            e.read();
            e.delete("ahmet");
            e.delete(1);
        });







        public void buyingStatement(){
            switch(btoe){
                case BANK_CARD:
                    System.out.println("There is a %5 extra with the bank card.");
                    p.setPrice(((price/100)*105));
                    break;

                case CREDİT_CARD:    
                     System.out.println("There is a %10 extra with the credit card.");
                     p.setPrice(((price/100)*110));
                     break;

                case CASH:
                     System.out.println("There is a no extra if it's cash.");
                     break;



            }
        }






    }
}