package leetcodeProblems.Arrays;

import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

public class GFG_LongestSubArr {
    public int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(sum == k){
                maxLength = i+1;
            }

            int rem = sum - k;

            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLength = Math.max(len,maxLength);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return maxLength;
    }
}
