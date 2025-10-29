import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        List <String> result = new ArrayList<>();
        for(int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            String piece = my_strings[i].substring(start, end + 1);
            result.add(piece);
        }
        
        return String.join("", result);
    }
}