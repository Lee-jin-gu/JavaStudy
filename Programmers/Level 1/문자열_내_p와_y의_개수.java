public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        String a = s.toLowerCase();
        System.out.println(a);
        int p=0, y=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == 'p'){
                p++;
            }
            if(a.charAt(i) == 'y'){
                y++;
            }
        }
        System.out.println(p==y?true:false);
    }
}
