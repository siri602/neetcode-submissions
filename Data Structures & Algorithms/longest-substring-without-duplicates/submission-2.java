class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0 || n==1) return n;
        HashSet<Character> set=new HashSet<>();
        int j=0;
        int max=0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,set.size());
        }
        return max;
    }
}
