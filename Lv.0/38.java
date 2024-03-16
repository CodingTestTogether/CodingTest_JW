//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
//문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

//replaceAll 정규식을 통해 괄호 안에 있는 문자를 모두 제거해주었습니다.

class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}