public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        long x = -4;
        int n =2;
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i] = x*(i+1);
        }
        for(int i=0;i<n;i++){
            System.out.println(answer[i]);
        }
    }
}
