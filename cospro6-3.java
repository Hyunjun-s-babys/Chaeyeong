import java.util.*;
class Solution {
    public int[] solution(int[] people) {
        
        int[] answer = new int[4];
				for(int i=0; i<people.length;i++){
					if (people[i]>=105)
						answer[3]++;
					else if (people[i]>=100)
						answer[2]++;
					else if (people[i]>=95)
						answer[1]++;
					else
						answer[0]++;
				}
        return answer;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] people = {97, 102, 93, 100, 107};
        int[] ret = sol.solution(people);

        
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
