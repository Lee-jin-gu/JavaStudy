public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        long n = 7;
        double a= Math.sqrt(n);
        System.out.println(a);
        long d = Double.valueOf(Math.pow(a+1, 2)).longValue();
        System.out.println(d);

    }
}
