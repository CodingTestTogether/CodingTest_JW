//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성하시오
//배열의 평균값

class Solution {

    public double solution(int[] numbers) {

        double answer = 0;

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {

            result += numbers[i];

        }

        answer = (double) result / numbers.length;

        return answer;

    }

}