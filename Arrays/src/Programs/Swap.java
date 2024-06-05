package Programs;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int arr[] = {1, 3, 23, 5, 6, 6};
        int index1 = 4;
        int index2 = 3;

        Swap(arr, index1, index2);

        System.out.println(Arrays.toString(arr));
    }

    public static void Swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
