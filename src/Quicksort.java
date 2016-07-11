
public final class Quicksort extends GenData {

    public static void main(String[] args) {

        int valN = 20;
        int valMax = 1024;
        int[] data = getData(valN, valMax);

        printArray(data);
        sortInplace(data, 0, data.length);
        printArray(data);
    }

    private static void sortInplace(int[] data, int ini, int end) {
        if (end - ini <= 1) return;
        else {

            setPivot(data, ini, end);
            int pivot = data[ini];

            int aa = ini;
            int bb = ini + 1;
            for (; bb < end; bb++) {
                if (data[bb] <= pivot) {
                    aa++;
                    switchValues(data, aa, bb);
                }
            }
            data[ini] = data[aa];
            data[aa] = pivot;

            sortInplace(data, ini, aa);
            sortInplace(data, aa + 1, end);
        }

    }

    private static void setPivot(int[] data, int ini, int end) {
        // Set median from first last and medium point as the pivot.
        int midPoint = (ini + end) / 2;
        int vIni = data[ini];
        int vMid = data[midPoint];
        int vEnd = data[end - 1];

        if (monotonic(vIni, vMid, vEnd)) {
            switchValues(data, ini, midPoint);
        } else if (monotonic(vMid, vEnd, vIni)) {
            switchValues(data, ini, end - 1);
        }
    }

    private static boolean monotonic(int vIni, int vMid, int vEnd) {
        return vIni <= vMid && vMid <= vEnd || vEnd < vMid && vMid < vIni;
    }

    private static void switchValues(int[] data, int aa, int bb) {
        int tmp;
        tmp = data[bb];
        data[bb] = data[aa];
        data[aa] = tmp;
    }

}
