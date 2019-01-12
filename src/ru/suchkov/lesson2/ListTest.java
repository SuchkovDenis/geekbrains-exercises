package ru.suchkov.lesson2;

public class ListTest {
    public static void main(String[] args) {
        System.out.println("ARRAY LIST TEST");
        Integer[] arr = {1,2,3,4};
        ArrayList<Integer> arrayList = new ArrayList<>(arr);
        System.out.println(String.format("Capacity: %2d, Size: %2d, %s",arrayList.capacity(), arrayList.size(), arrayList));
        for (int i = 0; i < 8; i++) {
            arrayList.add(i);
            System.out.println(String.format("Capacity: %2d, Size: %2d, %s",arrayList.capacity(), arrayList.size(), arrayList));
        }
        arrayList.remove(0);
        System.out.println(String.format("Capacity: %2d, Size: %2d, %s",arrayList.capacity(), arrayList.size(), arrayList));
        arrayList.add(15);
        arrayList.trimToSize();
        System.out.println(String.format("Capacity: %2d, Size: %2d, %s",arrayList.capacity(), arrayList.size(), arrayList));
        arrayList.add(3,18);
        System.out.println(String.format("Capacity: %2d, Size: %2d, %s",arrayList.capacity(), arrayList.size(), arrayList));
        System.out.println("==================================");
        System.out.println();

        System.out.println("LINKED LIST TEST");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            System.out.println(String.format("Size: %2d, %s", linkedList.size(), linkedList));
            linkedList.add(i);
        }
        System.out.println(String.format("Size: %2d, %s", linkedList.size(), linkedList));

        linkedList.add(1,777);
        System.out.println(String.format("Size: %2d, %s", linkedList.size(), linkedList));

    }
}
