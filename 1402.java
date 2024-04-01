import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int k = 0; k < arr.length; k++){

            arr[k] = sc.nextInt();
        }

        for(int k = arr.length - 1; k >= 0; k--){

            System.out.printf("%d ", arr[k]);
        }
    }
}
