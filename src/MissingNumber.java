import java.util.Arrays;


public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3,0,1};
        System.out.println(missNumb(nums));
    }

    public static int missNumb(int[] nums){
        int n = nums.length;
        return n*(n+1)/2 - Arrays.stream(nums).sum();
    }
}
