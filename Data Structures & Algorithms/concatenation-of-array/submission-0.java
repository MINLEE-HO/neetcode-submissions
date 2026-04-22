
class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i=0; i<nums.length; i++) {
            list.add(nums[i]);
        }

        int[] answer = new int[list.size()];
        int cnt = 0;
        for (int val : list) {
            answer[cnt++] = val;
        }
        return answer;
    }
}