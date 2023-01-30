import java.util.*;
public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int arr[] = {5,9,7,10};
        int[] answer;
        int divisor = 5;
        int i=0;
        for(int a : arr){
            if(a%divisor == 0){
                i++;
            }
        }
        if(i ==0){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[i];
        }
        i=0;
        for(int a : arr){
            if(a%divisor == 0){
                answer[i] = a;
                i++;
            }
        }
        Arrays.sort(answer);
        System.out.println(answer);
    }
}
