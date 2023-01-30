public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(word.substring((word.length()-1) / 2, word.length()/2 + 1));
    }
}
