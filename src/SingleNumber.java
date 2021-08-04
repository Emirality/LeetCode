import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};

        System.out.println(singleNumberXOR(nums));
        System.out.println(singleNumber(nums));

    }

    public static int singleNumberXOR(int[] nums){
        int mask =0;
        for (int m : nums){
            mask ^= m;
        }
        return mask;
    }

    public static int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }

}
