//변수명.replace(CharSequence target, CharSequence replacement)

// String str = "Hello, world!";
// String replacedStr = str.replace("world", "Universe");

// System.out.println(replacedStr); // 출력: Hello, Universe!

class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");

        return answer;
    }
}