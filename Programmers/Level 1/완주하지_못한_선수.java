import java.util.Arrays;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant ={"leo", "kiki", "eden"};
        String[] completion ={"eden", "kiki"};
        int i;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                System.out.println(participant[i]);
            }
        }
        System.out.println(participant[i]);
    }
}
