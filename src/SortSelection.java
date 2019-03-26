public class SortSelection {
    public static void sortChoice(int[] numbers) {
        long startTime = System.nanoTime();

        int min, temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            min = i;
            for (int scan = i + 1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min])
                    min = scan;
            }
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;

        }
        long finishTime = System.nanoTime() - startTime;
        System.out.println("программа выполнялась " + finishTime + " миллисекунд");
    }
}
