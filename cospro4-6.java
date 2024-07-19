import java.util.Arrays;
class Solution{
    public int solution(int point) {
        
        if (point < 1000)
            return 0;
        return (point / 100)*100;
    }    public static void main(String[] args) {
        Solution sol = new Solution();
        int point = 2323;
        int ret = sol.solution(point);
        
        
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
 
