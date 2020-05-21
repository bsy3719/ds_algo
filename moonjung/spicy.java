// 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 
// 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.
// Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
// Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
// 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
		Queue<Integer> queue = new PriorityQueue<>();
		for(int sco : scoville) {
			queue.offer(sco);
		}
		
		while(queue.peek() <= K) {
            
            if(queue.size() == 1){
                return -1;
            }
            
			int min_1 = queue.poll();
			int min_2 = queue.poll();
			int degree = min_1 + (min_2 * 2);
			queue.add(degree);
			answer ++;
		}
		return answer;
    }
}