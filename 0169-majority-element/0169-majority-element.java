class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
            max=nums[i+1];
        }
        count=0;
    
    return max;
    
    }
}