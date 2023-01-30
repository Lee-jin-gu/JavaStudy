import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        long n = 118372;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String aList : list)
            sb.append(aList);

        System.out.println(Long.parseLong(sb.reverse().toString()));
    }
}
