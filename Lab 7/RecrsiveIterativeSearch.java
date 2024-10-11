import java.util.Random;
import java.util.Scanner;

class IterativeSearch {

    public static int searchIterative(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1; 
            }
        }
        return 0;
    }
}
