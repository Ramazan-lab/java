import java.util.Objects;

class Urunler{


     void print(){
        System.out.println("tüm ürünler");
    }
}
class Gida extends Urunler{

    @Override
    void print() {
        System.out.println("gıda ürünleri");
    }
}

class Teknoloji extends Urunler{
    @Override
    void print() {
        System.out.println("teknoloji ürünleri");
        super.print();
    }
}


public class polymorfizm {
    public static void main(String[] args) {
        Urunler a;

        a=new Teknoloji();
        a.print();
        a=new Gida();
        a.print();
    }
}
