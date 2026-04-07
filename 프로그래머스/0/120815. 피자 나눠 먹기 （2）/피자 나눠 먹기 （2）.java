class Solution {
    // 유클리드 호제법
    // GCD(greatest common divisor) * LCM(least common multiple) = A * B
    // GCD = (A * B) / LCM
    // LCM = (A * B) / GCD

    public int solution(int n) {
        int answer = 1;

        int lcm = (n * 6) / gcd(n, 6);
        answer = lcm / 6;

        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}