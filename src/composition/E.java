package composition;

public class E {
    private A a;

    public E(A a){
        this.a=a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
