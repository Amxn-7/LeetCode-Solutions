class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> mh = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return b[0] - a[0];  
                return b[1] - a[1];      
            }
        );
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int dis = Math.abs(arr[i] - x);
            mh.add(new int[]{dis, arr[i]});
            if (mh.size() > k) {
                mh.poll();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!mh.isEmpty()) {
            ans.add(mh.poll()[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}