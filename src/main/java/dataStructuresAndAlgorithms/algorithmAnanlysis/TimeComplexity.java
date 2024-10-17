package dataStructuresAndAlgorithms.algorithmAnanlysis;

public class TimeComplexity {
    public static void main(String[] args) {
        double now  = System.currentTimeMillis();

        TimeComplexity timeComplexity = new TimeComplexity();
        System.out.println(timeComplexity.findSum(99999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millisecs");
    }

    private int findSum(int n) {
        return n * (n+1)/2;
    }

//    public int findSum(int n){
//        int sum = 0;
//        for(int i = 1; i <= n; i++){
//            sum += i;
//        }
//        return sum;
//    }
}
