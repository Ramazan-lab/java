package accessmodifier;


public class main {
    public static void main(String[] main){
        Data a = new Data("protected","public","private");
        System.out.println(a.name1);
        System.out.println(a.name2);
        System.out.println(a.getName());

        a.setName("Programiz");
    }
}
