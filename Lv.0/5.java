//나이 age가 주어질때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성하시오
//나이 출력

// 제한사항

// 0 < age <= 120
// 나이는 태어난 연도에 1살이며 1년마다 1씩 증가합닌다
class Solution {

    public int solution(int age) {

        int answer = 2022 - age + 1;

        return answer;

    }

}