package sorting.bubble_sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        BubbleSort.bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

