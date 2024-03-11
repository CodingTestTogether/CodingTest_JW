//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

//if문을 통해 answer 배열의 길이를 정해주었다.
//만약 정수 n이 짝수라면 배열의 길이는 n의 절반이고 그렇지 않다면 n 1을 더한 후 절반으로 나눔.(절반으로 나눈 후 1을 더해도 결과적으로는 같음.)
//이후 answer 배열의 길이만큼 for문을 순회하면서 answer 배열에 차곡차곡 정답이 쌓임.
//for문을 순회하면서 작은 수부터 입력되므로 따로 배열 정리는 하지 않음.

class Solution {
    public int[] solution(int n) {
        int[] answer;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = 2 * i + 1;
        }
        return answer;
    }
}