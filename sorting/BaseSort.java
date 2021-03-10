package sorting;
import java.util.List;

public abstract class BaseSort {
    List<Integer> input;
    
    BaseSort(List<Integer> numbers) {
        input = numbers;
    }

    public abstract List<Integer> sort();
    
    public void print() {
        for(int i: input) {
            System.out.println(i);
        }
    }
}