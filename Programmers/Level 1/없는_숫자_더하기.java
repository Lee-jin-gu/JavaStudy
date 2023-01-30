import java.util.Arrays;
import java.util.stream.IntStream;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int[] numbers = { 1,2,3,4,6,7,8,0};
        int temp=0;
        for(int i=0;i<numbers.length;i++){
            temp += numbers[i];
        }
        System.out.println(45-temp);
    }
}
