import java.util.ArrayList;

public class ThisKeyword {
    private int i;
    private ArrayList myUsers;

    public ThisKeyword(int i) {
        this.i = i;
    }

    public ThisKeyword() {

    }

    public String getMessage(){
        return "Hello World";
    }
    public String getI() {
        return i+this.getMessage();
    }

    public void setI(int i) {
        this.i = i;
    }
    public void setMyUsers(ArrayList myUsers){
       this.myUsers=myUsers;
    }

    public static void main(String[] args) {
        ThisKeyword a1=new ThisKeyword();
    }
}
