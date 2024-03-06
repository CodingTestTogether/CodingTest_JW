//정수 n이 주어질때, n이하의 짝수를 모두 더한 값을 return 하도록 soultion함수를 작성하시오
//짝수의 합
class Solution {

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                answer += i;

            }

        }

        return answer;

    }

}