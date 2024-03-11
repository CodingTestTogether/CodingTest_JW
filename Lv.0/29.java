//if문의 조건이 >=(이상) 조건이므로 가장 큰 값을 먼저 걸러주고 내려와야 한다. 
//반대로 <=(이하) 조건일 경우엔 작은 값을 먼저 거르고 내려와야 한다. 
//0.8, 0.9, 0.95가 double형이기 때문에 int형으로 변환해야 한다.

class Solution {
    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        } else {
            answer = price;
        }

        return answer;
    }
}