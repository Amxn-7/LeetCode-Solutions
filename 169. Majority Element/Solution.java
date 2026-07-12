class Solution {
    public int majorityElement(int[] nums) {
        int n  = nums.length;
        int pp = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(count==0) {
                pp = nums[i];
            }
            if(nums[i] == pp){
                count++;
            }
            else{
                count--;
            }
        }
        return pp;
    }
}