import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        int arr[] = new int[n];//배열 생성

        for (int i = 0; i<arr.length; i++){//배열에 키 넣기
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);//오름차순

        for (int i = 0; i<arr.length; i++){

            System.out.print(arr[i]+ " ");//println 아님

            if( (i+1)%c ==0){// 총 개수를 출력해야하므로 i+1
               System.out.println();
            }
        }
    }
}

//data set이 정해져 있을 때는 배열 쓰는게 좋고, 계속 입력받는(얼마만큼 입력받을지 모를 때) 리스트.
