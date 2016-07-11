import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mergesort extends GenData {
    public static void main(String[] args) {
        int valN = 20;
        int valMax = 1024;
        LinkedList<Integer> data = getDataList(valN, valMax);

        printList(data);


    }
}
