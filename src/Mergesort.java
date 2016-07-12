import java.util.*;

public class Mergesort extends GenData {
    public static void main(String[] args) {
        int valN = 20;
        int valMax = 1024;
        LinkedList<Integer> data = getDataList(valN, valMax);

        printList(data);
        List<Integer> sorted = mergeSort(data);
        printList(sorted);
    }

    private static List<Integer> mergeSort(List<Integer> input) {
        if (input.size() <= 1) {
            return input;
        } else {
            int mid = input.size() / 2;
            List<Integer> listA = mergeSort(input.subList(0, mid));
            List<Integer> listB = mergeSort(input.subList(mid, input.size()));

            return mergeLists(listA.iterator(), listB.iterator());
        }
    }

    private static LinkedList<Integer> mergeLists(Iterator<Integer> inputA, Iterator<Integer> inputB) {
        LinkedList<Integer> output = new LinkedList<Integer>();

        IteratorWithHead a = new IteratorWithHead(inputA);
        IteratorWithHead b = new IteratorWithHead(inputB);

        while (a.nonEmpty() && b.nonEmpty()) {
            if (a.head() < b.head()) {
                output.add(a.head());
                a.next();
            } else {
                output.add(b.head());
                b.next();
            }
        }
        while (a.nonEmpty()) {
            output.add(a.head());
            a.next();
        }
        while (b.nonEmpty()) {
            output.add(b.head());
            b.next();
        }
        return output;
    }
}
