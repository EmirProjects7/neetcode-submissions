class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String a : strs) {
            char[] charArray = a.toCharArray();
            Arrays.sort(charArray);
            String sortedA = new String(charArray);
            map.putIfAbsent(sortedA, new ArrayList<>());
            map.get(sortedA).add(a);
        }
        return new ArrayList<>(map.values());
    }
}
