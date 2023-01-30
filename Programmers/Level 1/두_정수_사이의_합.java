public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        int a = 3, b = 5;
        long c = Math.min(a,b), d = Math.max(a,b);
        System.out.println((d-c+1)*(c+d)/2);
    }
}
