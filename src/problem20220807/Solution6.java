package problem20220807;

class Solution6 {
    public int Solution6(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int current = i;
            int temp = count;
            while (current != 0) {
                if (current%10==3 || current%10==6 || current%10==9){
                    count++;
                    System.out.print("pair");
                }
                current /= 10;
            }
            if(temp == count)
                System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        return count;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int number = 40;
        int ret = sol.Solution6(number);

        // Press Run button to receive output.
        System.out.println("Solution6: return value of the method is " + ret + " .");
    }
}
