// 문자열 my_string과 정수 n이 매개변수로 주어질 때,
// my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

//문자열을 반복해서 연결하기 위해 StringBuilder를 사용해서,
//바깥 for문은 my_string의 길이만큼 순회하고, 안쪽 for문은 my_string의 문자를 몇 번이나 반복할지, 조건을 다루고 있다.
//append는 기존 문자열의 뒤에 문자열을 추가하는 기능이 있는 메소드이다.
//charAt을 통해 i번째 문자를 하나씩 받아 append로 추가하는 구조.

import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int n) {

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}