import java.util.Arrays;
import java.util.HashMap;

public class solution {
    public static boolean duplicate(int nums[]) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
