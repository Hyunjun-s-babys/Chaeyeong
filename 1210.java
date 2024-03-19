import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int array[] = {400, 340, 170, 100, 70};

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(array[a - 1] + array[b - 1] > 500 ? "angry" : "no angry");
    }
}
