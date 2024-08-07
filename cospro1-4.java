class Solution {
    int[] func_a(int[] arr){
        int[] counter = new int[1001]; //index는 1~1000
        for(int i = 0; i < arr.length; i++)
            counter[arr[i]]++;
        return counter;
    }
    
    int func_b(int[] arr){
        int ret = 0;
        for(int i = 0; i < arr.length; i++){
            if(ret < arr[i])
                ret = arr[i];
        }
        return ret;
    }
    
    int func_c(int[] arr){
        final int INF = 1001;
        int ret = INF;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && ret > arr[i])
                ret = arr[i];
        }
        return ret;
    }
    public int solution(int[] arr) {
        int[] counter = func_a(arr); //갯수 세기
        int maxCnt = func_b(counter); // 최대
        int minCnt = func_c(counter); // 최소
        return maxCnt / minCnt;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 3, 1, 3, 3, 2, 3, 2};
        int ret = sol.solution(arr);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
