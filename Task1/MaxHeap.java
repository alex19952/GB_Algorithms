package Task1;

import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heapList;

    public MaxHeap() {
        heapList = new ArrayList<>();
    }

    public void add(Integer num) {
        heapList.add(num);
        siftingUp();
    }

    public Integer pop() {
        if (heapList.isEmpty()) throw new RuntimeException("Task1.Main is empty");
        Integer max = heapList.get(0);
        heapList.set(0, heapList.get(heapList.size() - 1));
        heapList.set(heapList.size() - 1, max);
        heapList.remove(heapList.size() - 1);
        siftingDown(0);
        return max;
    }

    private void siftingUp() {
        for (int i = heapList.size() - 1; i > 0; i = (i - 1) / 2) {
            if (heapList.get(i) > heapList.get((i - 1) / 2)) {
                Integer temp = heapList.get((i - 1) / 2);
                heapList.set((i - 1) / 2, heapList.get(i));
                heapList.set(i, temp);
            }
        }
    }

    private void siftingDown(Integer i) {
        if (i * 2 + 1 > heapList.size() - 1) {
            return;
        }
        if (i * 2 + 2 > heapList.size() - 1 || heapList.get(i * 2 + 1) > heapList.get(i * 2 + 2)) {
            if (heapList.get(i * 2 + 1) > heapList.get(i)) {
                Integer temp = heapList.get(i * 2 + 1);
                heapList.set(i * 2 + 1, heapList.get(i));
                heapList.set(i, temp);
            }
                if (i * 2 + 2 > heapList.size() - 1) { return; }
                else siftingDown(i * 2 + 1);
        }
        if (heapList.get(i * 2 + 2) > heapList.get(i)) {
            Integer temp = heapList.get(i * 2 + 2);
            heapList.set(i * 2 + 2, heapList.get(i));
            heapList.set(i, temp);
        }
        siftingDown(i * 2 + 2);
    }

}