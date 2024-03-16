//정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 
//10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.

// 먼저, answer, sum, mul이라는 세 개의 변수를 선언합니다. answer는 최종적으로 반환할 결과를 저장할 변수이고, 
//sum은 배열의 요소들을 합한 값을 저장할 변수입니다. mul은 배열의 요소들을 곱한 값을 저장할 변수입니다.
// 반복문을 사용하여 배열 num_list의 각 요소를 순회합니다. 각 요소를 sum에 더하고, mul에 곱합니다.
// 배열의 길이가 11 이상인 경우(num_list.length >= 11)에는 배열의 요소들을 합산한 결과를 answer에 대입합니다. 
//그렇지 않은 경우에는 배열의 요소들을 곱한 결과를 answer에 대입합니다.
// 마지막으로, answer 값을 반환하여 함수의 결과로 반환합니다.

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }

        if (num_list.length >= 11) {
            answer = sum;
        } else {
            answer = mul;
        }

        return answer;
    }
}
