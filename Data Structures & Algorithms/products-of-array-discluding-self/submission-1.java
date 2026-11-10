class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixmul[]=new int[nums.length];
        int sufmul[]=new int[nums.length];
        int[] res=new int[nums.length];
        prefixmul[0]=1;
        sufmul[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            prefixmul[i]=prefixmul[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            sufmul[i]=sufmul[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=prefixmul[i]*sufmul[i];
        }
        return res;
    }
}  
