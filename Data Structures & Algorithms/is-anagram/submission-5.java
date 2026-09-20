class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        
        s.chars().mapToObj(c -> (char) c).forEach(c -> {
            int val = map.getOrDefault(c, 0);
            map.put(c, val + 1);
        });
        t.chars().mapToObj(c -> (char) c).forEach(c -> {
            int val = tMap.getOrDefault(c, 0);
            tMap.put(c, val + 1);
        });
        // System.out.println("map: " + map + ", tMap: " + tMap);

        // if (!map.keySet().containsAll(tMap.keySet()) || !tMap.keySet().containsAll(map.keySet()))
        //     return false;
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     // System.out.println("entry: " + entry);
        //     if (tMap.get(entry.getKey()) != entry.getValue())
        //         return false;
        // }
        return map.equals(tMap);
    }
}
