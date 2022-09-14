package oop;
    public class Technology extends Product{
        private String type;
        private String color;

public static int TECH_SIZE=0;
        Technology(String name, String price,String type, String color) {
            super(name, price);
            this.color=color;
            this.type=type;
            TECH_SIZE++;

        }
    }

