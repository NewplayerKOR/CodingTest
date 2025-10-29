import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        List <String> rString = new ArrayList<>();
        for(int i = 0; i < index_list.length; i++) {
            rString.add(my_string.substring(index_list[i], index_list[i]+1));
        }
        String[] arr = rString.toArray(new String[0]);
        
        String answer = String.join("", arr);
        return answer;
    }
}