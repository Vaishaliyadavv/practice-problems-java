package dataStructuresAndAlgorithms.recursion;

//https://leetcode.com/problems/fibonacci-number/
public class LeetCode509 {

    //TIME COMPLEXITY = 2^N -> EXPONENTIAL IN POWER

    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
