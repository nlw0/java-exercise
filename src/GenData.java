import java.util.Random;

public class GenData {

    private Random rand;

    public GenData() {
        rand = new Random();
    }

    public int[] getData(int N, int maxVal) {
        int[] aa = new int[N];
        int i;

        for (i = 0; i < N; i++) {
            aa[i] = rand.nextInt(maxVal);
        }
        return aa;
    }
}
