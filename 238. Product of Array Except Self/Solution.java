class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        for(int i =0 ;i<n;i++){
            prefix[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int i =n-1 ;i>=0;i--){
            suffix[i] = product;
            product *= nums[i];
        }
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = prefix[i] * suffix[i];
        }
return answer;

    }
}