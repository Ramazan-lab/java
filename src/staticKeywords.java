public class staticKeywords {
    static void statik(){
        System.out.println("sitatik methodalr obje oluşturmadan çalışabilir");
    }
    public void pblic(){
        System.out.println("public methodalr obje oluşturmadan çağırılamaz");

    }
    public static void main(String[] args){
        try {
            statik();
            staticKeywords publicobje= new staticKeywords();
            publicobje.pblic();
        }
        catch (Exception e){
            System.out.println("hata");
        }

    }
}
