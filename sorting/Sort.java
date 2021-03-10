package sorting;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (String s : args) {
            numbers.add(Integer.parseInt(s));           
        }

        BaseSort bubble = new BubbleSort(numbers);
        bubble.sort();
        bubble.print();

        BaseSort merge = new MergeSort(numbers);
        merge.sort();
        merge.print();
    }
}
