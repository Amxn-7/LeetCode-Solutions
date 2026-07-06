class Solution {
    public int pivotIndex(int[] nums) {
       int totalsum = 0;
       for(int i = 0;i<nums.length;i++){
            totalsum+=nums[i];
       }
       int leftsum = 0;
       for(int i =0;i<nums.length;i++){
        // int rightsum = totalsum-leftsum-nums[i];
        //  pivot means leftsum==rightsum so that means int rightsum = totalsum-leftsum-nums[i]; this line becomes int leftsum = totalsum-leftsum-nums[i]; so combinig both leftsum it becomes 2*leftsum;
        if(2*leftsum == totalsum-nums[i]) return i;
        leftsum+=nums[i];
    
       }
       return -1;
    }
}