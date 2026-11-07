class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(int i:map.keySet()){
            int f=map.get(i);
            if(bucket[f]==null) bucket[f]=new ArrayList<>();
            bucket[f].add(i);
        }
        int res[]=new int[k];
        int count=0;
        for(int i=bucket.length-1;i>=0 && count<k;i--){
            if(bucket[i]!=null){
                for(int integer:bucket[i]){
                    res[count++]=integer;
                }
            }
        }
        return res;
    }
}
