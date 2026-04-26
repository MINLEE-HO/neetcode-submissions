class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val , map.getOrDefault(val,0)+1);
        }

        int cnt = 0;
        int high = 0;
        for (int key : map.keySet()) {
            if (cnt < map.get(key)) {
                cnt = map.get(key);
                high = key;
            }
        }

        return high;
    }
}