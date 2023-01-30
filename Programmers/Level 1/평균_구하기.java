public class 평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        float temp = 0;
        for(int i = 0; i<arr.length; i++){
           temp += arr[i];
        }
        System.out.println(temp/arr.length);
    }
}
