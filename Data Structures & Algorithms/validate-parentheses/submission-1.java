class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty() || !isPair(stack.pop(), c)) {
                    return false;
                }   
            }
        }
        
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')' || open == '[' && close == ']' || open == '{' && close == '}');
    }
}



