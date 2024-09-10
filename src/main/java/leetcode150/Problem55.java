package leetcode150;

public class Problem55 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int reachable = 0;
        for(int i = 0; i < length ; i++){
            if (nums[0]==0 || reachable < i){
                return false;
            }
           reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
