class Solution {
    public boolean isValid(String s) {
        Deque<Character> bracketStack = new ArrayDeque<>();
        Map<Character, Character>map = new HashMap<>();       
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) { // contains means closing bracket
                if (bracketStack.isEmpty() || !bracketStack.peek().equals(map.get(c))) {
                    return false;
                }
                bracketStack.pop();
            } else { // does not contain means opening bracket
                bracketStack.push(c);
            }
        }

        return bracketStack.isEmpty();
    }
}