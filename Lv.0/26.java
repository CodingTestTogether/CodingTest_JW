//홀수의 개수를 담을 변수 odd와 짝수의 개수를 담을 변수 even을 선언하고 
//num_list의 각 원소들을 2로 나눠 나머지가 0이면 even의 값을 증가, 그렇지 않으면 odd 의 값이 증가하도록 했다.

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}