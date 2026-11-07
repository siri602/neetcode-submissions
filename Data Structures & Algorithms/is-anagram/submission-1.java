class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        int[] c=new int[26];
        for(int i=0;i<n;i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int j:c){
            if(j!=0) return false;
        }
        return true;
    }
}
