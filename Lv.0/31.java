//어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
//처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

//인덱스 0부터 t까지 순회할때 각 반복마다 n에 2를 곱한 값을 할당했다.

class Solution {
    public int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        return n;
    }
}

// Math 클래스의 pow 메소드를 사용. 결과는 n * 2의 t제곱이다.
// Math.pow()를 쓸 때 주의할 점이 있다.
// 이는 결과값을 double형으로 반환하기 때문에 위와 같이 int형으로 캐스팅이 필요함.
// 만약 캐스팅을 하지 않고 실행한다면 double형을 int형에 할당하려고 했으므로 컴파일 오류가 발생.
class Solution2 {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n * (int) Math.pow(2, t);
        return answer;
    }
}