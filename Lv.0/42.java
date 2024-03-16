//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 
//numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

// 정수 배열 numlist에서 주어진 정수 n의 배수가 아닌 수들을 제거하여 새로운 배열을 생성하는 Java의 솔루션입니다.
// arr 배열을 선언하여 numlist와 동일한 길이로 초기화합니다.
// cnt 변수를 선언하여 새로운 배열에 추가할 요소의 인덱스를 추적합니다. 초기값은 0입니다.
// 반복문을 통해 numlist의 각 요소를 확인합니다.
// 만약 numlist[i]가 n의 배수라면, arr 배열에 해당 값을 추가하고 cnt 값을 증가시킵니다.
// 새로운 배열의 길이를 cnt 값으로 설정하여 answer 배열을 초기화합니다.
// arr 배열의 처음부터 cnt까지의 요소를 answer 배열로 복사합니다.
// answer 배열을 반환합니다.
// 이 방법을 사용하여 numlist 배열에서 n의 배수가 아닌 수를 제거한 새로운 배열을 생성하게 됩니다.

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int cnt = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arr[cnt] = numlist[i];
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}