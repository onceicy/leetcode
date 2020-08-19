package code;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(
                (new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return map.get(o1) - map.get(o2);
					}
				})
        );
        for(int num : map.keySet()){
            heap.add(num);
            if(heap.size() > k) heap.poll();
        }
        int [] result = new int[heap.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
