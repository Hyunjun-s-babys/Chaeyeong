import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        int year = sc.nextInt();
        int month = sc.nextInt();

        int x = (year%400==0?1:year%4==0&year%100!=0?1:0);
       
        if(month==1|month==3|month==5|month==7|month==8|month==10|month==12){
            System.out.println(31);

    }
        else if(month==4|month==6|month==9|month==11){
            System.out.println("30");
    }

        else{
            if(x==1){
            System.out.println(29);
        }
            else{
                System.out.println("28");
            }
        }
        
    
    
    }
}
