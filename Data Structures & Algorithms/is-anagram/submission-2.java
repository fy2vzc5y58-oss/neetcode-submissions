class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();

        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);

            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= t.length() - 1; i++) {
            char a = t.charAt(i);

            if (mapS.containsKey(a)) {
                mapS.put(a, mapS.get(a) - 1);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : mapS.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
