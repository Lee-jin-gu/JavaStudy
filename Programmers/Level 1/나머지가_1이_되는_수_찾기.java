public class 나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        for(int i=1;i<n;i++){
            if(n%i == 1){
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
