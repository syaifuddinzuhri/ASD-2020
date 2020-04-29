package MergeSortTest;

/**
 * SortMain
 */
public class SortMain {
    public static void main(final String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan Merge Sort");
        final MergeSort mSort = new MergeSort();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}