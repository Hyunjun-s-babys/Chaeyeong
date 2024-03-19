import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        int w = sc.nextInt();
        int adv = sc.nextInt();
        int money = sc.nextInt();

       
       
        if(adv-money>w){
            System.out.println("advertise");

    }
        else if(adv-money==w){
            System.out.println("does not matter");
    }

        else{
            System.out.println("do not advertise");
    
    
    }
}
}
