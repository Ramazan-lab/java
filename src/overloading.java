public class overloading {
    private String formatNumber(double value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value,int score) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        overloading hs = new overloading();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
    }
}
