import java.util.Arrays;

public class QuickSort implements Sort {

    public static void ToSort (int[] array) {
        int startIndex = 0;
        int endIndex = array.length-1;
        doSort(array, startIndex, endIndex);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    public static void doSort(int[] array, int start, int end) {

        if (start >= end)
            return;
        int i = start, j = end;
        int bas = (i+j)/2;

        while (i < j) {
            while (i < bas && (array[i] <= array[bas])) {
                i++;
            }
            while (j > bas && (array[j] >= array[bas])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == bas)
                    bas = j;
                else if (j == bas)
                    bas = i;
            }
        }
        doSort(array, start, bas);
        doSort(array, bas + 1, end);
    }

}
