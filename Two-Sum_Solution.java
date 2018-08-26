class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int [] results = new int[2];
        
        outerloop:
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j=1; j < nums.length; j++) 
            {
                sum = nums[i] + nums[j];
                
                if (sum == target && i != j) 
                {
                    results[0] = i;
                    results[1] = j;
                    break outerloop;
                } 
                else 
                {
                    sum = 0;
                }
            }            
        }
        
        // int [] arr = {0,1};
        return results;
    }
}