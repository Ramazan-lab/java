package oop;

import org.w3c.dom.ls.LSOutput;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.HashSet;

public class Emplooye implements Crud<Product>,Query<User>{
    int updatecount=0;
    private ArrayList<Product> productArrayList;
    private ArrayList<User> userArrayList;
    public Emplooye(ArrayList<Product> p,ArrayList<User> u){
        this.productArrayList=p;
        this.userArrayList=u;
    }
    @Override
    public void read() {
        for (Product p: this.productArrayList){
            System.out.println(p);
        }
    }



    @Override
    public void update(Product updatedProduct,String name) {
        for(Product p: this.productArrayList){
            if(name==p.getName()){
                p.setPrice(updatedProduct.getPrice());
                System.out.println("atama yapıldı");
                Product.PRODUCT_SIZE--;

            }else {
                System.out.println("eşleşen olmadı");
            }

        }
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void delete(int id) {
        int usIdIndex=userArrayList.indexOf(id);
        userArrayList.remove(usIdIndex);
    }



    public void delete(String name){
        int usNameIndex=userArrayList.indexOf(name);
        userArrayList.remove(usNameIndex);

    }

    public int getUpdatecount() {
        return updatecount;
    }


    @Override
    public User getUsersById(int id) {
            //int i=id.intValue();
        return userArrayList.get(id);
        //Long id2=Long.valueOf(i);

    }

    @Override
    public ArrayList<User> getAllUserss() {
        return userArrayList;
    }

    @Override
    public User deleteUserById(Long id) {
        return null;
    }


}
