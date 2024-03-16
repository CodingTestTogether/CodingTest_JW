//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 
//크면 0을 return하도록 solution 함수를 완성해주세요.

// solution 함수는 정수 배열을 매개변수로 받습니다: num_list.
// answer 변수를 선언하고 초기값을 0으로 설정합니다.
// sum 변수를 선언하고 초기값을 0으로 설정합니다. 이 변수는 배열의 각 요소의 합을 저장합니다.
// mul 변수를 선언하고 초기값을 1로 설정합니다. 이 변수는 배열의 각 요소의 곱을 저장합니다.
// 반복문을 사용하여 배열의 각 요소를 순회하면서 sum에 더하고, mul에 곱합니다.
// 조건문을 사용하여 합의 제곱이 곱보다 큰지 확인합니다.
// 만약 합의 제곱이 곱보다 크다면, answer에 1을 대입합니다.
// 그렇지 않으면, 즉 합의 제곱이 곱보다 크지 않다면, answer에 0을 대입합니다.
// 최종적으로 answer 값을 반환합니다.

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        if (Math.pow(sum, 2) > mul) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}