package sorting;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort extends BaseSort {

    boolean did_swap_in_prev_iter;

    public BubbleSort(List<Integer> numbers) {
        super(numbers);
        did_swap_in_prev_iter = true;
    }

    public List<Integer> sort() {
        while(did_swap_in_prev_iter) {
            boolean swapped = false;
            for(int i=0; i<input.size()-1; i++) {
                if(input.get(i) > input.get(i+1)) {
                    // bubble up
                    int temp = input.get(i+1);
                    input.set(i+1, input.get(i));
                    input.set(i, temp);
                    swapped = true;
                }
            }
            did_swap_in_prev_iter = swapped;
        }

        return input;
    }

}
