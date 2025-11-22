import java.util.*;

public class MoveZeroesSolve {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int pos = 0;

        for (int n : nums) {
            if (n != 0) nums[pos++] = n;
        }

        while (pos < nums.length) nums[pos++] = 0;
    }
}
