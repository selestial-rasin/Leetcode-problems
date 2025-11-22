import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};

        int[] res = intersection(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);

        HashSet<Integer> ans = new HashSet<>();
        for (int x : b) {
            if (set.contains(x)) ans.add(x);
        }

        int[] arr = new int[ans.size()];
        int i = 0;
        for (int x : ans) arr[i++] = x;
        return arr;
    }
}
