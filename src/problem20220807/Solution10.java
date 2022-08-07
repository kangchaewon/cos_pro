package problem20220807;

class Solution10 {
    public int Solution10(int[] data) {
        double total = 0;
        int len = data.length;
        for(int i = 0; i < len; i++)
            total += data[i];
        int cnt = 0;
        double average = total / len;
        for(int i = 0; i < len; i++)
            if (data[i] <= average)
                cnt += 1;
        return cnt;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct Solution10 method.
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ret1 = sol.Solution10(data1);

        // Press Run button to receive output.
        System.out.println("Solution10: return value of the method is " + ret1 + " .");

        int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
        int ret2 = sol.Solution10(data2);

        // Press Run button to receive output.
        System.out.println("Solution10: return value of the method is " + ret2 + " .");
    }
}