public class 자릿수_더하기 {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;
        int a = n;
        while (a >= 1) {
            answer += a % 10;
            a /= 10;
        }
        System.out.println(answer);
    }
}
