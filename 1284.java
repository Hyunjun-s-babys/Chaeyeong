import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=2;i<a;i++){
            if(a%i==0){
                if(i==2){
                    list.add(2);
                }
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        break;
                    }
                    if(j==i-1){
                        list.add(i);
                    }
                }
            }
        }

        if(list.size()==2 && list.get(0)*list.get(1)==a){
        System.out.printf("%d %d",list.get(0),list.get(1));
        }
        else{
        System.out.println("wrong number");
        }
     }
}
