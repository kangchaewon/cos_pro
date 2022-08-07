package problem20220807;

import java.util.*;

class Solution5 {
    public int[] Solution5(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.Solution5(arr);

        // Press Run button to receive output.
        System.out.println("Solution5: return value of the method is " + Arrays.toString(ret) + " .");
    }
}