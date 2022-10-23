package programmers;

import java.util.Stack;

public class Parenthesis01 {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                st.push(s.charAt(i));
            } else if (')' == s.charAt(i)) {
                if(st.empty()==true)
                    return false;
                st.pop();
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        Parenthesis01 parenthesis = new Parenthesis01();
        String s= "())()";
        System.out.println(parenthesis.solution(s));

    }
}
