class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] s_arr = strs[i].toCharArray();
            Arrays.sort(s_arr);
            String key = String.valueOf(s_arr);
            if (hash.containsKey(key)){
                hash.get(key).add(strs[i]);
            }else {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                hash.put(key,temp);
            }
        }
        return new ArrayList<List<String>>(hash.values());
    }
}