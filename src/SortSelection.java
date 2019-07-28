import java.util.Arrays;

public class SortSelection implements Sort {
    public void ToSort (int[] array) {
        long startTime = System.nanoTime();

        int min, temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int scan = i + 1; scan < array.length; scan++) {
                if (array[scan] < array[min])
                    min = scan;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
        long finishTime = System.nanoTime() - startTime;
        System.out.println("программа выполнялась " + finishTime + " миллисекунд");
    }
}
