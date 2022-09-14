package oop;

import java.util.Date;

public class Supply extends Product{
    private String type;
    private String ttet;

    public static int SUP_SIZE=0;
    Supply(String name, String price, String type, String ttet) {
        super(name, price);
        this.ttet=ttet;
        this.type=type;
        SUP_SIZE++;

    }
}
