public class SortInsert {
    public static void sortInsert(int[] numbers) {

        long startTime = System.nanoTime();

        int temp, j;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                j = i;
                while (j > 0 && temp < numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    j--;
                }
                numbers[j] = temp;
            }
        }
        long finishTime = System.nanoTime() - startTime;
        System.out.println("программа выполнялась " + finishTime + " миллисекунд");

    }
}
