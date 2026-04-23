class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch(c) {
                case ')':
                    if (st.isEmpty() || st.peek() != '(') return false;
                    st.pop();
                    break;

                case '}':
                    if (st.isEmpty() || st.peek() != '{') return false;
                    st.pop();
                    break;

                case ']':
                    if (st.isEmpty() || st.peek() != '[') return false;
                    st.pop();
                    break;

                default:
                    st.push(c);
                    break;
            }
            
        }

        return st.isEmpty();
    }
}
