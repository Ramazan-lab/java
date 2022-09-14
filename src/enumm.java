 enum Firma{
    TEKNOSA (20),
    VATAN (30),
     JBL (35);

    private final int saatlik;


     Firma(int saatlik) {
         this.saatlik = saatlik;
     }
     private int getSaatlik(){
         return saatlik;
     }
     private int saat=10;

     double günlük(){
         return saatlik*saat;
     }

     double aylık(){
         return saat*saatlik*26;
     }

         public static void main(String[] args) {

             for (Firma f:Firma.values()){
                 System.out.println("günlük maaşınız:"+" "+f.günlük()+"aylık:"+"  "+f.aylık());
             }

         }


 }


