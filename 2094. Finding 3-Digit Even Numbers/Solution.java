class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>(); 
        for(int i =0 ;i< digits.length;i++){
            if(digits[i]==0) continue;
            for(int j = 0;j<digits.length;j++){
                if(j==i) continue;
                for(int k = 0;k<digits.length;k++){
                    if((k==i)||(k==j)) continue;
                    if(digits[k]%2==0){
                        int num = digits[i]*100 + digits[j]*10 + digits[k];
                        result.add(num);
                    }
                }
            }
           
            }
         List<Integer> fun = new ArrayList<>(result);
         Collections.sort(fun);
         int[] set  = new int[fun.size()];
         for(int i = 0; i<fun.size();i++){
            set[i] = fun.get(i);
         }
         return set;
                
    }
}