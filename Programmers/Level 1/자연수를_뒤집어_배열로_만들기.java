public class 자연수를_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = 12345;
        String a = Long.toString(n);
        int answer[] = new int[a.length()];
        int temp = a.length();
        for(int i=0;i<a.length();i++){
            answer[i] = a.charAt(temp-1) - 48;
            temp--;
            System.out.println(answer[i]);
        }
    }
}
