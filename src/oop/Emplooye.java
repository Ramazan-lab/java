package oop;

import java.util.ArrayList;
import java.util.HashSet;

public class Emplooye implements Crud<Product>{
    private ArrayList<Product> productArrayList;
    public Emplooye(ArrayList<Product> p){
        this.productArrayList=p;
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
            }else {
                System.out.println("eşleşen olmadı");
            }
        }
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Object getUsersById(Long id) {
        return null;
    }

    @Override
    public ArrayList getAllUserss() {
        return null;
    }

    @Override
    public Object deleteUserById(Long id) {
        return null;
    }
}
