package sorting;

import java.util.List;

public class QuickSort extends BaseSort {
    QuickSort(List<Integer> numbers) {
        super(numbers);
    }

    /**
     * Quick sort picks a pivot element and puts smaller number before it, and bigger numbers after it.
     * It then partitions the array at the pivot point and repeats above process
     */
    public List<Integer> sort() {
        quickSort(input, 0, input.size()-1);
        return input;
    }

    /**
     * 
     * @param List array 
     * @param int low beginIndex
     * @param int high endIndex
     */
    private void quickSort(List<Integer> array, int low, int high) {
        if(low<high) {
            int partitionIdx = partition(array, low, high);
            quickSort(array, low, partitionIdx-1); // repeat for list before partition index
            quickSort(array, partitionIdx+1, high); // repease for list after partition index 
        }
    }

    private int partition(List<Integer> array, int low, int high) {
        // pick high index as pivot
        int pivot = array.get(high);
        int i = low - 1;
        for(int j=low; j<high; j++) {
            if(array.get(j) < pivot) {
                i++;
                int temp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, temp);
            }
        }
        // index i is at the last element which was smaller than pivot. It will be -1 if every element is greater than pivot
        i++;
        int temp = array.get(i);
        array.set(i, pivot);
        array.set(high, temp);
        return i;
    }
}
