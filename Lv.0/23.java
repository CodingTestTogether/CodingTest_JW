//3항연산자를 사용하여 인원수를 7로 나눠 나머지가 0이라면 인원수를 7로 나눈 값을 return하고 
//나머지가 0이 아니라면 인원수를 7로 나눈 값에 +1 을 한 값을 return하도록 했다. (피자 한 판 추가)

class Solution {
    public int solution(int n) {

        return (n % 7 == 0) ? (n / 7) : (n / 7 + 1);
    }
}