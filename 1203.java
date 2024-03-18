import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a <= 10) {
            System.out.println("정상");
        } else if (a <= 20) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
