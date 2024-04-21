package leetcodeProblems;

// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class Problem3 {

    // Method to find median
    static double Median(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if (n > m)
            return Median(B,
                    A); // Swapping to make A smaller

        int start = 0;
        int end = n;
        int mergedArray = (n + m + 1) / 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            int leftASize = mid;
            int leftBSize = mergedArray - mid;
            int leftA = (leftASize > 0)
                    ? A[leftASize - 1]
                    : Integer.MIN_VALUE; // checking overflow
            // of indices
            int leftB = (leftBSize > 0) ? B[leftBSize - 1]
                    : Integer.MIN_VALUE;
            int rightA = (leftASize < n)
                    ? A[leftASize]
                    : Integer.MAX_VALUE;
            int rightB = (leftBSize < m)
                    ? B[leftBSize]
                    : Integer.MAX_VALUE;

            // if correct partition is done
            if (leftA <= rightB && leftB <= rightA) {
                if ((m + n) % 2 == 0)
                    return (Math.max(leftA, leftB)
                            + Math.min(rightA, rightB))
                            / 2.0;
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return 0.0;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };
        System.out.println("Median of the two arrays are");
        System.out.println(Median(arr1, arr2));
    }
}