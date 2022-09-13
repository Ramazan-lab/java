import java.io.*;
import java.util.*;
class Address{
   String sehir;
   String ilce;

    Address(String sehir, String ilce){
        this.sehir=sehir;
        this.ilce=ilce;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
}

class Product{
    String product_id;
    String product_name;
    String product_price;

    Product(String product_id, String product_name, String product_price){
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_price=product_price;
    }

}
class Users{
    public int user_id;
    private  List<Product> product;
    private  Address adress;

    Users(Address adress,List<Product> product){
        this.adress=adress;
        this.product=product;
    }
    public Address GetAdressList(){
        return adress;
    }
    public List<Product> GetProductList(){
        return product;
    }
    Users(int user_id){
        this.user_id=user_id;
    }
}



public class composition {
    public static void main(String[] args) {
        Address a1= new Address("istanbul","eyüp");
        Address a2= new Address("kastamonu","taşköprü");
        Product p1= new Product("1","bilgisayar","200TL");
        Product p2= new Product("2","telefon","300TL");
        Users u1=new Users(1);


        List<Address> adresses=new ArrayList<Address>();
        adresses.add(a1);

        List<Product> products=new ArrayList<Product>();
        products.add(p1);


        ArrayList<Users> userArrayList=new ArrayList<>();
        userArrayList.add(u1);

        for(Users us:userArrayList){
            System.out.println(us.user_id);

        }
    }

}
