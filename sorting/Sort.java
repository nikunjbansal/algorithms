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
        List<Integer> sorted = bubble.sort();
        for(int i: sorted) {
            System.out.println(i);
        }

    }
}