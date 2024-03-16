//순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 
//자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.

//i가 n보다 작거나 같을 때 for문이 순회합니다. n을 i로 나눈 나머지가 0이라면 i는 n의 약수라는 뜻입니다. 
//변수 j에 n을 i로 나눈 값을 차례차례 저장합니다. 이때 순서쌍의 값은 i와 j입니다. 
//i가 j보다 작거나 같을 때까지 값을 구해서, 조건에 해당하는 값이 있을 때마다 answer가 1씩 증가합니다.
//이후 if문에서는 i와 j의 값이 같을 때 count 변수가 1씩 증가합니다. 
//이는 제곱수가 있을 때 한 번만 증가시키기 위하여(answer에서 두 번 카운트 되므로) 빼야하는 값입니다. 제곱수가 있는 n도 있고, 
//없는 수도 있으므로 해당하는 경우에만 뺄 수 있도록 조건문을 썼습니다.
//이후 return을 통해 정답을 반환합니다. 여기에서 곱하기 2를 한 이유는 순서쌍은 순서가 바뀌면 다른 쌍으로 인식합니다. 
//예를 들어, n이 20이라면 i가 20이고 j가 1인 경우와 i가 1이고 j가 20인 경우는 다른 것입니다. 
//n의 약수는 {1, 2, 4, 5, 10, 20} 입니다. 위의 코드 식대로 계산한다면, (1, 20), (2, 10), (4, 5) 까지만 구했습니다. 
//이후의 쌍은 앞서 구한 쌍들의 순서만 바뀐 값이니까요. 
//count는 앞서 설명했듯 제곱수의 수를 뜻하는 변수입니다. n이 20일 때에는 약수에 제곱수가 없으므로 해당하지 않습니다만, 
//다음 입출력 예인 n이 100일 때에는 10 * 10으로, 순서쌍 (10, 10)이 두 번 카운트되므로 이 중 하나를 빼는 역할을 할 것입니다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int j = n / i;
                if (i <= j) {
                    answer++;
                }
                if (i == j) {
                    count++;
                }
            }
        }
        return answer * 2 - count;
    }
}