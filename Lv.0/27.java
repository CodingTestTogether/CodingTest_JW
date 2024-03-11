//contains는 문자열 안에 해당하는 문자열이 포함되어 있는지 판별해주는 메소드이다. 
//대소문자를 구분하므로 대소문자가 섞인 문자열끼리 비교하고 싶다면 주의가 필요함.

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}