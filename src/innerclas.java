class outer {
    int x = 10;

    class inner {
        int y = 5;
        public int myInnerMethod() {
            return x;
        }
    }
}

public class innerclas {
    public static void main(String[] args) {
        //method static olursa outer sınıfından obje oluşturmadan inner sınıfına ulaşılabılir
        //outer.inner myInner = new outer.inner();
       // System.out.println(myInner.y);

        //inner methodundan outere ulaşma
        outer myOuter = new outer();
        outer.inner myInner =myOuter.new inner();
        System.out.println(myInner.myInnerMethod());
    }
}

