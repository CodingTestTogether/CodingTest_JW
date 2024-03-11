//(12000원 x 양꼬치 n인분) + ((음료수 k개 - (양꼬치 n인분 / 10)) x 2000원)
//10인분당 음료수 하나가 서비스이므로 k에서 n을 10으로 나눈 값을 뺐다.

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        answer = (n * 12000) + ((k - (n / 10)) * 2000);
        return answer;
    }
}