import java.util.Arrays;

public class BubbleSort implements Sort {
    public void ToSort (int[] array) {
        boolean isSorted = true;
        int buf;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = true;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}
