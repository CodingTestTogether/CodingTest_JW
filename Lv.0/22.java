// 정수 배열 numbers에서 num1번째부터 num2번째 인덱스까지 잘라야 하므로 
//for문에서 i를 num1로 초기화하고 num2까지 반복하도록 했다. 
//answer에 값을 할당할 때 answer의 0번째 인덱스부터 할당해야 하는데 
//for문의 i는 num1부터 시작해서 인덱스가 맞지 않는다. 
//그래서 0부터 시작하는 count를 줘서 0번째 인덱스부터 값이 할당되도록 했다.

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        int count = 0;
        for (int i = num1; i <= num2; i++) {
            answer[count] = numbers[i];
            count++;
        }

        return answer;
    }
}