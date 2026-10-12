class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(n, n, "", result);
        return result;
    }
    
    private void solve(int open, int close, String op, List<String> ans) {
        // Base case: when no more open or close parentheses can be added
        if (open == 0 && close == 0) {
            ans.add(op);
            return;
        }
        
        // If we still have open parentheses left, we can always add one
        if (open > 0) {
            solve(open - 1, close, op + "(", ans);
        }
        
        // We can only add a close parenthesis if the number of close 
        // parentheses remaining is greater than the open ones remaining
        if (close > open) {
            solve(open, close - 1, op + ")", ans);
        }
    }
}