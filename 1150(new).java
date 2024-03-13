import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();


        System.out.println(a<=b ? (a<=c? a:c) : (b<=c? b:c));
          }
      }

//if(a <= b){
            if(a <= c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }

            
        }

        else{
            if(b<=c){
                System.out.println(b); 
            }
            else{
                System.out.println(c);
            }
        }
    }
