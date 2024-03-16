//두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, 
//flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

// solution 함수는 세 개의 매개변수를 받습니다: 정수 a, 정수 b, 불린 타입의 변수 flag.
// answer 변수를 선언하고 초기값을 0으로 설정합니다.
// 조건문을 사용하여 flag 변수가 true인지 확인합니다.
// 만약 flag가 true라면, a와 b를 더한 값을 answer에 대입합니다.
// 그렇지 않으면, a에서 b를 뺀 값을 answer에 대입합니다.
// 최종적으로 answer 값을 반환합니다.

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }
}