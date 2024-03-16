//자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

// Scanner 클래스를 사용하여 사용자로부터 입력을 받을 수 있는 객체 sc를 생성합니다.
// sc.nextInt() 메서드를 사용하여 정수를 입력받아 변수 n에 저장합니다.
// 조건문을 사용하여 n이 짝수인지 확인합니다.
// 만약 n이 짝수라면, "n is even"을 출력합니다.
// 그렇지 않으면, 즉 n이 홀수라면, "n is odd"를 출력합니다.

import java.util.Scanner;

public class sasibpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }
    }
}
