package problem20220807;

// You may use import as below.

class Solution2 {
    public int solution2(int price, String grade) {
        // Write code here.
        if (grade == "V") {
            price = price * 85 / 100;
        } else if (grade == "G") {
            price = price * 90 / 100;
        } else if (grade == "S") {
            price = price * 95 / 100;
        }
        int answer = price;
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int price1 = 2500;
        String grade1 = new String();
        grade1="V";
        int ret1 = sol.solution2(price1, grade1);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");

        int price2 = 96900;
        String grade2 = new String();
        grade2="S";
        int ret2 = sol.solution2(price2, grade2);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
