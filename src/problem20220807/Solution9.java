package problem20220807;

class Solution9 {
    public String Solution9(String characters){
        String result = "";
        result += characters.charAt(0);
        for (int i = 1; i < characters.length(); i++) {
            if (characters.charAt(i-1) != characters.charAt(i))
                result += characters.charAt(i);
        }
        return result;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct Solution9 method.
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        String characters = "senteeeencccccceeee";
        String ret = sol.Solution9(characters);

        // Press Run button to receive output.
        System.out.println("Solution9: return value of the method is " + ret + " .");
    }
}
