import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        int time = sc.nextInt();
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

       
       
        int goalresult = (90 - time) % 5 == 0 ? ((90 - time) / 5) + score1 : ((90 - time) / 5) + score1 + 1;

        System.out.println(goalresult != score2 ? goalresult > score2 ? "win" : "lose" : "same");
    }
}
