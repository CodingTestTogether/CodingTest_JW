//정부 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성하시오
//배열 두 배 만들기

class Solution {

    public int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            answer[i] = numbers[i] * 2;

        }

        return answer;

    }

}