import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a=sc.nextLine();

        char[] arr = a.toCharArray();

        for(int i=0;i<arr.length;i++){
            if (arr[i]==' ') {
                System.out.printf(" ");
            }
            else if(arr[i]-3<97){
                System.out.printf("%c",arr[i]+23);
            }
            else{
                System.out.printf("%c",arr[i]-3);
            }

        }

    }
 
}
