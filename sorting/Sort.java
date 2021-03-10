package sorting;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (String s : args) {
            numbers.add(Integer.parseInt(s));           
        }

        System.out.println("\n");
        System.out.println("Bubble Sort");
        BaseSort bubble = new BubbleSort(numbers);
        bubble.sort();
        bubble.print();

        System.out.println("\n");
        System.out.println("Merge Sort");
        BaseSort merge = new MergeSort(numbers);
        merge.sort();
        merge.print();

        System.out.println("\n");
        System.out.println("Quick Sort");
        BaseSort quick = new QuickSort(numbers);
        quick.sort();
        quick.print();
    }
}
