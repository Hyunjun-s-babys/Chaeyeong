class Solution {
    public int solution(int[] temperature, int A, int B) {
        
		int answer = 0;
		for(int i = A + 1; i < B ; i++) {
			if(temperature[i] > temperature[A] && temperature[i] > temperature[B])
				answer += 1;
		}
		return answer;
	}

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
		Solution sol = new Solution();
		int[] temperature = {3, 2, 1, 5, 4, 3, 3, 6};
		int A = 1;
		int B = 6;
		int ret = sol.solution(temperature, A, B);

		
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
