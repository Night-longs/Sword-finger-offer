public class Solution {
    public int NumberOf1(int n) {
        int sum = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            n=n>>>1;
        }
        return sum;
    }

}
