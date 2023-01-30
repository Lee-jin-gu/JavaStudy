public class 하샤드_수 {
    public static void main(String[] args) {
        int x = 10;
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }

        if (x % sum == 0) {
            System.out.println(true);
        } else
            System.out.println(false);

    }
}
