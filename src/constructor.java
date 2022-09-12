class constructor{
    int id;
    String name;

    constructor(int i,String n){
        id = i;
        name = n;
    }
    //constructorler bize objeyi oluştururken direkt parametre olarak değer girmrmize izin verir
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){

        constructor e1 = new constructor(1,"furkan");
        constructor e2 = new constructor(2,"ilker");
        e1.display();
        e2.display();
    }
}  