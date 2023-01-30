public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        System.out.println(String.valueOf(ch));
    }

}
