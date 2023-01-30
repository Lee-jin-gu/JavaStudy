import java.util.Arrays;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        int x = Arrays.asList(seoul).indexOf("Kim");

        System.out.println("김서방은 "+ x + "에 있다");
    }
}
