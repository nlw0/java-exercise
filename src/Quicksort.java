
public class Quicksort {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        GenData gd = new GenData();

        int valN = 20;
        int valMax = 1024;
        int[] data = gd.getData(valN, valMax);

        printArray(data);
        sortInplace(data, 0, data.length);
        printArray(data);

    }

    private static void sortInplace(int[] data, int ini, int end) {
        int tmp;
        if (end - ini <= 1) return;
        else {
            int pivot = data[ini];
            int aa = ini;
            int bb = ini + 1;
            for (; bb < end; bb++) {
                if (data[bb] <= pivot) {
                    aa++;
                    tmp = data[bb];
                    data[bb] = data[aa];
                    data[aa] = tmp;
                }
            }
            data[ini] = data[aa];
            data[aa] = pivot;

            sortInplace(data, ini, aa);
            sortInplace(data, aa + 1, end);
        }

    }

    private static void printArray(int[] data) {
        int i;
        for (i = 0; i < data.length; i++) {
            System.out.print(String.format("%d ", data[i]));
        }
        System.out.println();
    }
}
