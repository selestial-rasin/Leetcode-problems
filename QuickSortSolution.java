import java.util.*;

public class QuickSortSolution {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] a, int l, int r) {
        if (l >= r) return;

        int pivot = a[(l + r) / 2];
        int i = l, j = r;

        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(a, l, j);
        quickSort(a, i, r);
    }
}
