import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float a= sc.nextInt();
        float b= sc.nextInt();
        float c= sc.nextInt();
        
        System.out.printf("%.2f",(a+b+c)/3);
        
    }
}
