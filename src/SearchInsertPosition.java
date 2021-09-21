public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,7};
        int target = 3;

        System.out.println(indexPos(nums,target));
    }

    public static int indexPos(int[] nums, int target){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i]>=target){
                return i;
            }
        }
        return n;
    }
}
