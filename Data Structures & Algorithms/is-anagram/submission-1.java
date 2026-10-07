class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        if (s.isEmpty() || t.isEmpty()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (char b : t.toCharArray()) {
            if (map.containsKey(b)) {
                map.put(b, map.get(b) - 1);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
