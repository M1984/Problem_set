class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n_nums = nums.length;
        int output[] = new int[2];
        for(int i = 0; i < n_nums; i++){
            for(int j = 0; j < n_nums; j++){
                if (nums[i] + nums[j] == target){
                    output[0] = j;
                    output[1] = i;
                    
                }
            }
        }
        return output;
    }
}