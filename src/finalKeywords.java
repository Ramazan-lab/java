public class finalKeywords {
    final int x =4;

        //final ile oluşturulan değişkenler asla değiştirilemez ve hep sabit kalır

    public static void main(String[] args){
        finalKeywords fnl= new finalKeywords();
        fnl.x=25;
        System.out.println(" x"+x);
        x=25;
        System.out.println(" x"+x);


    }
}
