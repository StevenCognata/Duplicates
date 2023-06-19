import java.util.Arrays;

public class Solution {
    public static boolean Duplicate(int nums[]) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
