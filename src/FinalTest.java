public class FinalTest {
    private int score;

    public FinalTest(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        final FinalTest finalTest=new FinalTest(5); //RAM: 555

        //finalTest=new FinalTest(5); //RAM:123
        finalTest.setScore(25); //RAM: 555
        //sabit değer X, Sabit Addresss!


        final int test=5;
        //test=6;

    }
}
