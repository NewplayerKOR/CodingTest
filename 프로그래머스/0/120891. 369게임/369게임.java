class Solution {
    public int solution(int order) {
        int answer = 0;

        // 1 <= order <= 1000000
        // 나머지 추출
        while (order > 0) {
            int digit = order % 10; // 마지막 자릿수

            // digit 검증
            if (digit != 0 && digit % 3 == 0) {
                answer++;
            }

            // 다음 자릿수
            order /= 10;
        }

        return answer;
    }
}