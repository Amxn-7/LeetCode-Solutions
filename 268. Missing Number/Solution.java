class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumofindex = 0;
        for(int i = 0;i<=n;i++){
            sumofindex+=i;
        }
        int sumofarray = 0;
        for(int i = 0;i<=n-1;i++){
            sumofarray+=nums[i];
        }
        int ans = sumofindex-sumofarray;
        return ans;

    }
}