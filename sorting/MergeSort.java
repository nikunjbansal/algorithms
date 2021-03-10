package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends BaseSort{
    MergeSort(List<Integer> numbers) {
        super(numbers);
    }

    /**
     * Merge sort recursively divides array into 2 parts and merges the sorted arrays in the end
     */
    public List<Integer> sort() {
        mergeSort(input, 0, input.size());
        return input;
    }

    private void mergeSort(List<Integer> array, int l, int r) {
        if(l<r) {
            int m = (r+l)/2;
            mergeSort(array, l, m);
            mergeSort(array, m+1, r);
            merge(array, l, m, r);
        }
    }

    private void merge(List<Integer> array, int l, int m, int r) {
        
        // merge 2 lists by picking one element from both and comparing
        // list 1 = array[l...m]
        // list 2 = array[m+1...r]
        ArrayList<Integer> first = new ArrayList<>(array.subList(l, m));    
        ArrayList<Integer> second = new ArrayList<>(array.subList(m, r)); 

        int k = l;
        while(!first.isEmpty() && !second.isEmpty()) {
            int elem1 = first.get(0);
            int elem2 = second.get(0);
            if(elem1 < elem2) {
                array.set(k, elem1);
                first.remove(0);
            } else {
                array.set(k, elem2);
                second.remove(0);
            }
            k++;
        }

        while(!first.isEmpty()) {
            array.set(k, first.get(0));
            k++;
            first.remove(0);
        }

        while(!second.isEmpty()) {
            array.set(k, second.get(0));
            k++;
            second.remove(0);
        }
    }
}
