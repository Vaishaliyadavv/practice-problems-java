package leetcodeProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Problem229_majorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int majElement1=0;
        int majElement2=1;
        int count1=0;
        int count2=0;

        for(int num : nums){
            if(num == majElement1){
                count1++;
            } else if(num == majElement2){
                count2++;
            } else if(count1 == 0){
                majElement1 = num;
                count1 = 1;
            } else if(count2 == 0){
                majElement2 = num;
                count2 = 1;
            } else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == majElement1) count1++;
            else if (num == majElement2) count2++;
        }

        int len = nums.length / 3;
        if (count1 > len) list.add(majElement1);
        if (count2 > len) list.add(majElement2);

        return list;
    }
}
