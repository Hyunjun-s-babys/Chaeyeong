import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();

        System.out.println(a >= 60 ? a >= 70 ? a >= 80 ? a >= 90 ? "A" : "B" : "C" : "D" : "F");
        
    }      
}
