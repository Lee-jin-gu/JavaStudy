public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] temp, arr = {4,3,2,1};
        int mi=0;
        if(arr.length==1){
            temp = new int[1];
            temp[0] = -1;
            System.out.println(temp);;
        }else{
            temp = new int[arr.length -1];
        }

        int cnt = arr[0];
        for(int i=0; i<arr.length;i++){
            if(cnt > arr[i]){
                cnt = arr[i];
            }
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]==cnt){
                mi--;
            }else{
                temp[mi] = arr[i];
            }
            mi++;
        }

        System.out.println(temp);
    }
}
