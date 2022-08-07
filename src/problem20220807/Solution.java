package problem20220807;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] shirtSize) {
        // Write code here.
        int[] answer = new int[6];
        for(int i=0;i< shirtSize.length;i++){
            if(shirtSize[i]=="XS"){
                answer[0]++;            }
            else if (shirtSize[i]=="S") {
                answer[1]++;
            }
            else if (shirtSize[i]=="M") {
                answer[2]++;
            }
            else if (shirtSize[i]=="L") {
                answer[3]++;
            }
            else if (shirtSize[i]=="XL") {
                answer[4]++;
            }
            else if (shirtSize[i]=="XXL") {
                answer[5]++;
            }
        }
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        sol.solution(shirtSize);
        int[] ret = sol.solution(shirtSize);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}
