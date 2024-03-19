import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a > 170 ? (b > 170 ? (c > 170 ? "PASS" : "CRASH " + c) : "CRASH " + b) : "CRASH " + a);
    }
}
