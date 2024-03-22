import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

    
        int a = sc.nextInt();
    
        for(int i=2; i<a; i++){
            


            if(a%i==0){
                System.out.println("not prime");

                break;
            }

            if(i==a-1){
                System.out.println("prime");
            }
        }
        if(a==2){
            System.out.println("prime");
        }

    }
}
