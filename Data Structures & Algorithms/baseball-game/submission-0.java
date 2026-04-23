class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String c : operations) {
            switch(c) {
                case "+":
                    st.push(Integer.valueOf(st.get(st.size()-1)) + Integer.valueOf(st.get(st.size()-2)));
                    break;
                case "C" :
                    st.pop();
                    break;
                case "D" :
                    st.push(Integer.valueOf(st.get(st.size()-1)) * 2);
                    break;
                default :
                    st.push(Integer.valueOf(c));
                    break;
            }
        }

        int answer = 0;
        while (!st.isEmpty()) {
            answer += Integer.valueOf(st.pop());
        }

        return answer;
    }
}