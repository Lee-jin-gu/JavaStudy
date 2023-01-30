public class 콜라츠_추측 {
    public static void main(String[] args) {
        long num = 6;
        int answer = 0;
        while(num!=1){
            if(num%2==0){
                num/=2;
            }else {
                num = (num*3) + 1;
            }
            answer ++;
            if(answer>500) {
                System.out.println(-1);
            }
        }
        System.out.println(answer);
    }
}
