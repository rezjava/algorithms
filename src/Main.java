import javax.swing.plaf.ScrollBarUI;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.exp;
import static java.lang.Math.random;

public class Main {

    public static void showMenu() {
        System.out.println("=============================");
        System.out.println("|     MENU SELECTION        |");
        System.out.println("=============================");
        System.out.println("|     Options:              |");
        System.out.println("|  1. sort selection        |");
        System.out.println("|  2. sort insertion        |");
        System.out.println("|  3. merge sorting         |");
        System.out.println("|  4. quick sorting         |");
        System.out.println("|  5. pyramid(heap) sorting |");
        System.out.println("|  6. bubble sorting        |");
        System.out.println("|  7. sort of shell         |");
        System.out.println("|  8. binary tree sorting   |");
        System.out.println("| 'q' exit from program     |");
        System.out.println("|============================");
    }

    //ввести размерность массива
    public static String inputLengthOfArray() throws IOException {
        System.out.println("Input leangh of array:");
        Scanner in = new Scanner(System.in);
        String array_value = in.next();
        return array_value;
    }

    public static boolean checkLengthOfArray(String array_value) {
        for (int i = 0; i < array_value.length(); i++) {
            if (Character.isDigit(array_value.charAt(i))) {
                continue;
            } else {
                System.out.println("You've written not a digit");
                System.out.println("try again");
                return false;
            }
        }
        return true;
    }


    //заполнить массив случайными числами
    public static int[] inputArray(String array_length) {
        System.out.println("the array is filled with random numbers from 1 to 100\n");
        int length = Integer.parseInt(array_length);
        int array[] = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + random() * 100);
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        return array;
    }

    private static void switch_var(char var, int[] array) {
        switch (var) {
            case 1:
                SortSelection sort1 = new SortSelection();
                System.out.println("sort selection:");
                sort1.ToSort(array);
                break;
            case 2:
                SortInsert sort3 = new SortInsert();
                System.out.println("sort insertion:");
                sort3.ToSort(array);
                break;
            case 3:
                SortMerger sort2 = new SortMerger();
                System.out.println("merge sorting:");
                sort2.ToSort(array);
                break;
            case 4:
                QuickSort sort4 = new QuickSort();
                System.out.println("quick sorting:");
                sort4.ToSort(array);
                break;
            case 5:
                HeapSort sort5 = new HeapSort();
                System.out.println("pyramide sorting:");
                sort5.ToSort(array);
                break;
            case 6:
                BubbleSort sort6 = new BubbleSort();
                System.out.println("bubble sorting:");
                sort6.ToSort(array);
                break;
            case 7:
                ShellSort sort7 = new ShellSort();
                System.out.println("sort of shell:");
                sort7.ToSort(array);
                break;
            case 8:
                Tree sort8 = new Tree();
                System.out.println("binary tree sort:");
                sort8.ToSort(array);
                break;
        }
    }

    public static boolean isValid(char ch) {
        if (ch > '1' | ch < '9') return true;
        else return false;
    }

    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        char choice;
        try {
            for (; ; ) {
                showMenu();
                String lenght = inputLengthOfArray();
                do {
                    System.out.println("Make a choice of algorithm sorting:");
                    choice = (char) System.in.read();
                } while (!isValid(choice));
                if (checkLengthOfArray(lenght)) {
                    int[] inputArray = inputArray(lenght);
                    switch_var(choice, inputArray);
                } else {
                    System.out.println("you input wrong number");
                }
                System.out.println();
                System.out.println("For continue press 'y', exit - 'q'");
                char choiceEnd = in.next().charAt(0);
                if (choiceEnd == 'Y' || choiceEnd == 'y') {
                    continue;
                } else
                    System.out.println("out of program...");
                break;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}






