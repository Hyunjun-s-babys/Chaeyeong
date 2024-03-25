import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

    
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double data=a;

        for(int i=1;i<=b;i++){
            double percent = sc.nextDouble()/100;

            data=data*(1+percent);

        }
        System.out.printf("%.0f\n",data - a);
        System.out.printf(data - a>=0?(data-a !=0 ? "good":"same"):"bad");
     }
    }
