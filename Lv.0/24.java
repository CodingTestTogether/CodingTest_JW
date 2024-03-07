//2중for문으로 s1과 s2의 원소들을 한 자리씩 비교하여 같은 원소가 있으면 answer가 1씩 증가하도록 했다.

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}