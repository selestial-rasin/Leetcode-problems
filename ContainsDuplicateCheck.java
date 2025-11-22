
import java.util.*;

public class ContainsDuplicateCheck {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}
