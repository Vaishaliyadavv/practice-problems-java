package capegeminiPrep.pdfWaleQues;

//merge intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ques30 {

    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= end){
                end = Math.max(end,intervals[i][1]);
            } else{
                list.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        list.add(new int[]{start,end});

        System.out.println("Merged intervals:");
        for (int[] it : list) {
            System.out.println(it[0] + " " + it[1]);
        }
    }
}
