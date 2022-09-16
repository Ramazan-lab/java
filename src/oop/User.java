package oop;

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

    }

    @Override
    public void buy(Product product, BuyingTypesEnum enumsw){
       // System.out.println("product received: "+product.getName());

        try{
            int number = Integer.parseInt(budget);
            int productnumber=Integer.parseInt(product.getPrice());
            System.out.println("your budget is: "+number+"TL");
            //DRY: don't repeat yourself
            if (number>productnumber) {
            switch (enumsw) {
                case CASH:
                    number -= productnumber;
                    break;
                case BANK_CARD:
                    number -= Integer.valueOf((int) (productnumber+Double.valueOf(productnumber)*0.05));
                    break;
                case CREDIT_CARD:
                    number -= Integer.valueOf((int) (productnumber+Double.valueOf(productnumber)*0.50));
                    break;
            }
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
