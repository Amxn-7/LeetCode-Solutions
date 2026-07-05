class Solution {

// static {
// Runtime.getRuntime().addShutdownHook (new Thread(() -> {
// try (FileWriter fw = new FileWriter("display_runtime.txt")) {
// fw.write("0");
// } catch (Exception e) {}
// }));
// }
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}