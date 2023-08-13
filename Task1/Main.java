package Task1;

import java.util.ArrayList;

class Main {
    
    public static void main(String[] args) {
        System.out.println("s");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(Sorter.sort(arrayList));
    }
}