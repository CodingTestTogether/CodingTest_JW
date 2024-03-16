//정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

// 주어진 코드는 세 개의 정수 number, n, m을 매개변수로 받고, number가 n으로 나누어 떨어지고 
// 동시에 m으로도 나누어 떨어질 때에만 1을 반환하고, 그 외의 경우에는 0을 반환하는 함수를 구현한 것입니다.
// solution 함수는 세 개의 매개변수를 받습니다: number, n, m.
// answer 변수를 선언하고 초기값을 0으로 설정합니다.
// 조건문을 사용하여 number가 n으로 나누어 떨어지고 동시에 m으로도 나누어 떨어지는지 확인합니다.
// 만약 위의 조건이 모두 만족된다면, answer에 1을 대입합니다.
// 그렇지 않으면, 즉 number가 n으로 나누어 떨어지지 않거나 m으로 나누어 떨어지지 않는다면, answer에 0을 대입합니다.
// 최종적으로 answer 값을 반환합니다.
// 이 함수는 number가 n과 m으로 모두 나누어 떨어질 때에만 1을 반환하고, 그 외의 경우에는 0을 반환합니다. 
// 따라서 함수의 호출 결과는 number가 주어진 조건을 만족하는지 여부에 따라 다르게 나올 것입니다.

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}