public class 신규_아이디_추천 {
    public static void main(String[] args) {
        String new_id = "\"...!@BaT#*..y.abcdefghijklm\"";
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        while(temp.contains("..")){
            temp = temp.replace("..", ".");
        }
        temp = temp.replaceAll("^[.]|[.]$", "");

        temp = temp.isEmpty()? "a" : temp;

        if (temp.length() >= 16) {
            temp = temp.substring(0, 15);
        }

        temp = temp.replaceAll("[.]$", "");

        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        System.out.println(temp);

    }
}
