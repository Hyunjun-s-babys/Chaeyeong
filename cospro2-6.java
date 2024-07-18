import java.util.*;
class Solution {
    public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i = 1; i < length; ++i){
            if(floors[i]>=floors[i-1])
                dist += floors[i] - floors[i-1];
            else
                dist += floors[i-1] - floors[i];
        }
        return dist;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
