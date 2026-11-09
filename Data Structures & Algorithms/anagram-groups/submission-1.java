class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chararray=s.toCharArray();
            Arrays.sort(chararray);
            String sorteds=new String(chararray);
            map.putIfAbsent(sorteds,new ArrayList<>());
            map.get(sorteds).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
