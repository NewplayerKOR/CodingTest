import java.util.*;
class Solution {
    public int solution(String number) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            int digit = ch - '0';
            nums.add(digit);
        }
        Integer[] arr = nums.toArray(new Integer[0]);
        int[] result = Arrays.stream(arr).mapToInt(i -> i).toArray();
        int sum = 0;
        for(int nums2 : result) {
            sum += nums2;
        }
        
        int answer = sum % 9;
        return answer;
    }
}