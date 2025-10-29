import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int nums : num_list) {
            if(nums % 2 == 0) {
                sb1.append(nums);
            } else {
                sb2.append(nums);
            }
        }
        
        int num1 = Integer.parseInt(sb1.toString());
        int num2 = Integer.parseInt(sb2.toString());
        int answer = num1 + num2;
        
        return answer;
    }
}