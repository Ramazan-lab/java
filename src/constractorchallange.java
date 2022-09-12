class Adress{
    private String adres;
    private String phone;
    public Adress(String a,String phone){
        adres=a;
        this.phone=phone;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}

 class User{
    String name;
    Adress adress;
    public User(String n,Adress adress){
        name=n;
        this.adress=adress;
    }

}

public class constractorchallange {
    public static void main(String[] args) {
        Adress adress=new Adress("ASDASDASD","12312");
        User isim= new User("ahmet",adress);
       //COMPOSITION
    }


}
