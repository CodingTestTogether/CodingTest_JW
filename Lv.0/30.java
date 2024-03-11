//정렬을 통해 배열의 최댓값을 먼저 구해주었습니다. 이 sort는 기본적으로 배열을 오름차순으로 정렬하므로, 
//배열의 마지막 원소와 그 앞의 원소가 이 배열에서 가장 큰 두 수이다. 여기서 구한 두 수를 곱해주면 풀이가 끝.
//import java.util.Arrays; 프로그래머스에서 이거 안적었다고 계속 수행실패뜸

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}