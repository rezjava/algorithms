import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.random;
import static sun.security.krb5.internal.crypto.KeyUsage.isValid;

public class Main {

    public void showMenu() {
        System.out.println("===================================");
        System.out.println("|   MENU SELECTION DEMO           |");
        System.out.println("===================================");
        System.out.println("|           Options:              |");
        System.out.println("|        1. sort selection        |");
        System.out.println("|        2. sort insertion        |");
        System.out.println("|        3. merge sorting         |");
        System.out.println("|        4. quick sorting         |");
        System.out.println("|        5. pyramid(heap) sorting |");
        System.out.println("|        6. bubble sorting        |");
        System.out.println("|        7. sort of shell         |");
        System.out.println("|        8. binary tree sorting   |");
        System.out.println("|       'q' exit from program     |");
        System.out.println("|==================================");
        System.out.println("\nMake a choice of algorithm sorting:");
    }

    private void switch_var(char var, int[] array) {
        switch (var) {
            case 1:
                SortSelection sort4 = new SortSelection();
                System.out.println("sort selection:");
                sort4.sortChoice(array);
                break;
            case 2:
                SortInsert sort3 = new SortInsert();
                System.out.println("sort insertion:");
                sort3.sortInsert(array);
                break;
            case 3:
                SortMerger sort2 = new SortMerger();
                System.out.println("merge sorting:");
                sort2.sortMerger(array);
                break;
            case 4:
                QuickSort sort1 = new QuickSort();
                System.out.println("quick sorting:");
                sort1.quickSort(array);
                break;
            case 5:
                HeapSort sort5 = new HeapSort();
                System.out.println("pyramide sorting:");
                sort5.sort(array);
                break;
            case 6:
                BubbleSort sort6 = new BubbleSort();
                System.out.println("bubble sorting:");
                sort6.bubbleSort(array);
                break;
            case 7:
                ShellSort sort7 = new ShellSort();
                System.out.println("sort of shell:");
                sort7.shellSort(array);
                break;
            case 8:
                Tree sort8 = new Tree();
                System.out.println("binary tree sort:");
                sort8.treeSort(array);
                break;
            case 9:
                System.out.println("quick");
                break;
        }
    }
    //ввести размерность массива
    public int inputValueOfArray() throws IOException {
        System.out.println("введите размерность масстива: ");
        Scanner scan = new Scanner(System.in);
        int array_value = scan.nextInt();
        if (array_value <= 0) {
            System.out.println("вы ввели неверное значение размерности массива");
            return array_value;
        }
        //заполнить массив случайными числами
    public int[] inputNumInArray ( int array_val){
            System.out.println("массив заполнен случайными числами от 1 до 100");
            int array[] = new int[array_val];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (1 + random() * 100);
                System.out.printf("%d ", array[i]);
            }

    return array;
    }


        public boolean isValid ( char ch){
            if (ch < '1' | ch > '9' & ch != 'q') return false;
            else return true;
        }

        public static void main (String args[]){

            char choice, ignore;

            for (; ; ) {
                do {
                    showMenu();
                    choice = (char) System.in.read();
                    do {
                    ignore = (char) System.in.read();
                    } while (ignore != '\n');

                } while (!isValid(choice));

            inputValueOfArray();
            inputNumInArray(array_value);
            switch_var(choice,inputNumInArray);
            }
        }
    }
}





