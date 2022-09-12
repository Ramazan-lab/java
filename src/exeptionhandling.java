import java.util.LinkedList;

public class exeptionhandling {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3,4};
            System.out.println(myNumbers[3]);

        } catch (Exception e) {
            System.out.println("hata bulundu.");
        } finally {
            System.out.println("try catch işlemi bitti");
        }
    }
}