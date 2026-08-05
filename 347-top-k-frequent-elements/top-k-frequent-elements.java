class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int [] arr= new int[k];
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(int key:map.keySet())
        {
            pq.add(key);

            if(pq.size()>k)
            {
                pq.poll();
            }
        }

        for(int i = k-1 ; i>=0 ; i--)
        {
            arr[i] = pq.poll();
        }

        return arr;
        
    }
}