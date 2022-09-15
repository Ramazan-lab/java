package composition;

public class Main {
    public static void main(String[] args) {
        C c=new C();
        A a=new A(c);
        E e=new E(a);


        e.getA().getC().getScore2();





    }
}
