package leetcodeProblems;

public class Problem771 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (char j : J.toCharArray()) {
            for (char s : S.toCharArray()) {
                if (s == j) {
                    result++;
                }
            }
        }
        return result;
    }

}
