// 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라 줍니다.
// 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
// n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를
// 완성해보세요.

//먼저 피자는 2조각에서 10조각까지 잘라주므로 조건을 걸었습니다. 
//n을 slice로 나눈 나머지가 0이라면 수가 맞아떨어지므로 n / slice를, 그렇지 않다면 부족한 것이므로 n / slice에서 한 판 더 시키는 것으로

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (2 <= slice && slice <= 10) {
            answer = (n % slice == 0) ? (n / slice) : (n / slice) + 1;
        }
        return answer;
    }
}