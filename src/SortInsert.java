import java.util.Arrays;

public class SortInsert implements Sort {
    public void ToSort (int[] array) {

        long startTime = System.nanoTime();

        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
        long finishTime = System.nanoTime() - startTime;
        System.out.println("программа выполнялась " + finishTime + " миллисекунд");

    }
}
