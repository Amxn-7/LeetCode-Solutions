class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;

        // arr[i] = {enqueueTime, processingTime, originalIndex}
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = tasks[i][0];
            arr[i][1] = tasks[i][1];
            arr[i][2] = i;
        }

        // Sort by enqueue time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Min heap:
        // first -> processing time
        // second -> original index
        PriorityQueue<int[]> mnh = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        );

        int[] ans = new int[n];

        int i = 0;
        int cnt = 0;
        long time = 0;

        while (cnt < n) {

            // If heap is empty, jump time to the next task
            if (mnh.isEmpty() && time < arr[i][0]) {
                time = arr[i][0];
            }

            // Add all tasks that have arrived
            while (i < n && arr[i][0] <= time) {
                mnh.add(new int[]{arr[i][1], arr[i][2]});
                i++;
            }

            // Pick task with smallest processing time
            // If tied, smallest original index
            int[] curr = mnh.poll();

            ans[cnt] = curr[1];

            // Move CPU time forward
            time += curr[0];
            cnt++;
        }
        return ans;
    }
}