//두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

// Scanner 클래스를 사용하여 사용자로부터 입력을 받을 수 있는 객체 sc를 생성합니다.
// sc.next() 메서드를 사용하여 첫 번째 문자열을 입력받아 변수 a에 저장합니다.
// sc.next() 메서드를 사용하여 두 번째 문자열을 입력받아 변수 b에 저장합니다.
// 입력받은 두 문자열 a와 b를 이어붙여서 출력합니다.

import java.util.Scanner;

public class sasibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b);
    }
}
