class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashSet<Character> set=new HashSet<>();
        int n=s.length();
        int j=0;
        int i=0;
        int max=0;
        while(i<n){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                max=Math.max(max,set.size());
            }
            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(ch);
            }
            i++;
            
        }
        return max;
    }
}
