import java.util.Stack;
class Brackets {
    private char coressponding(char c){
        if(c=='}')
            return '{';
        if(c==']')
            return '[';
        if(c==')')
            return '(';
        return 0;
    }
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();
        for(int i =0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
            }else{
                if(stack.empty()){
                    return 0;
                }else if(stack.peek()==coressponding(c)){
                    stack.pop();
                }else{
                    return 0;
                }
            } 
        }
        return stack.empty()?1:0;
    }
}