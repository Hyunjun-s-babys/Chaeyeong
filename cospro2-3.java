import java.util.*;
class Solution {
    public int solution(int N, int M) {
        
        int answer = 0;
				for(int i=N; i<=M;i++)
					if(i%2==0)
						answer+=i*i;
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 4;
        int M = 7;
        int ret = sol.solution(N, M);

          
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
