package Task1;

import java.util.ArrayList;

public class Sorter {
    public static ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        MaxHeap maxHeap = new MaxHeap();
        for (Integer num : arrayList) {
            maxHeap.add(num);
        }
        for(int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.set(i, maxHeap.pop());
        }
        return arrayList;
    }
}
