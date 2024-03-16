//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

//이번에도 마찬가지로 replaceAll과 정규식을 통해 숫자 이외의 문자는 제거해주었습니다. 
//for문으로 intString의 길이만큼 순회하면서, i번째 자리의 숫자를 복합 대입 연산자(+=)를 통해 하나씩 더해주었습니다. 
//여기서 getNumbericValue는 숫자 형태의 char형을 int로 바꿔주는 역할을 합니다.

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String sentence = my_string.replaceAll("[^0-9]", "");
        for (int i = 0; i < sentence.length(); i++) {
            answer += Character.getNumericValue(sentence.charAt(i));
        }
        return answer;
    }
}