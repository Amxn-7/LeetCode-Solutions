class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq=new LinkedList<>();
        Queue<Integer> dq=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R') rq.add(i);
            else dq.add(i);
        }
        while(!rq.isEmpty() && !dq.isEmpty()){
            int r=rq.poll();
            int d=dq.poll();
            if(r<d) rq.add(r+n);
            else dq.add(d+n);
        }
        if(!rq.isEmpty()) return "Radiant";
        else return "Dire";
        
    }
}