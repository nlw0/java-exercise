import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GenData {

    static private Random rand = new Random();

    static public int[] getData(int N, int maxVal) {
        int[] aa = new int[N];
        int i;
        for (i = 0; i < N; i++) {
            aa[i] = rand.nextInt(maxVal);
        }
        return aa;
    }

    static public LinkedList<Integer> getDataList(int N, int maxVal) {
        LinkedList<Integer> aa = new LinkedList<Integer>();
        int i;
        for (i = 0; i < N; i++) {
            aa.add(rand.nextInt(maxVal));
        }
        return aa;
    }

    static void printArray(int[] data) {
        int i;
        for (i = 0; i < data.length; i++) {
            System.out.print(String.format("%d ", data[i]));
        }
        System.out.println();
    }

    static void printList(LinkedList<Integer> data) {
        for (Integer ii : data) {
            System.out.print(String.format("%d ", ii));
        }
        System.out.println();
    }
}
