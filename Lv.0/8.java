//정수 num1과 num2가 매개변수로 주어질때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성하시오
//두 수의 나눗셈

// 입출력 예

// #1) 3 / 2 =1.5에 1,000을 곱하면 1500이 됩니다
// #2) 7 / 3 = 2.3333...에 1,000을 곱하면 2333.3333...이 되며, 정수 부분은 2333입니다
// #3) 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며, 정수 부분은 62입니다
class Solution {

    public int solution(int num1, int num2) {

        float answer = (float) num1 / num2 * 1000;

        return (int) answer;

    }

}