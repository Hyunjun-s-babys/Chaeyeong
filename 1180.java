import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        a=((a%10 *10+ a/10)*2) % 100;
    


       
                System.out.printf("%d\n%s", a, a <= 50 ? "GOOD" : "OH MY GOD");
            }

        
         
}
