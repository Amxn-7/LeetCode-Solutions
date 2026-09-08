/class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 0;
        int lastEnd = intervals[0][1];
        int n = intervals.length;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= lastEnd) {
                lastEnd = intervals[i][1];
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}