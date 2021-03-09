package sorting;
import java.util.List;

public abstract class BaseSort {
    List<Integer> input;
    List<Integer> output;

    BaseSort(List<Integer> numbers) {
        input = numbers;
    }

    public abstract List<Integer> sort();
}