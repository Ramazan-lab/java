abstract class Process{
     void remove(){
         System.out.println("kaldırıldı");
    }
     void add(){
         System.out.println("eklendi");
    }
     abstract void update();
     abstract void show();
}
class mysql extends Process{

    @Override
    void update() {
        System.out.println("mysql güncellendi");
    }

    @Override
    void show() {
        System.out.println("mysql gösterildi");
    }
}
class mongo extends Process{

    @Override
    void update() {
        System.out.println("mongo güncellendi");
    }

    @Override
    void show() {
        System.out.println("mongo gösterildi");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Process p1=new mysql();
        Process p2=new mongo();

        p1.add();
        p1.remove();
        p2.show();
        p2.update();
        p1.show();
        p1.update();

    }
}
