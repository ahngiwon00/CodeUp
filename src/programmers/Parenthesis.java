package programmers;

public class Parenthesis {
    boolean solution(String s) {
        boolean answer = true;
        while (s.indexOf("()")>=0){
            s = s.replace("()", "");
        }

        if(s.length()!=0)
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Parenthesis parenthesis = new Parenthesis();
        String s= "((())()(())";
        System.out.println(parenthesis.solution(s));

    }
}
