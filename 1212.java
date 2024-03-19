import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(c < a + b && a< b+ c && b< a+ c){
            System.out.println("yes");

    }
        else{
            System.out.println("no");
    }
        
    
    
    }
}
