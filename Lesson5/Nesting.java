class Nesting {
    public int solution(String S) {
        // write your code in Java SE 8
        int counter = 0;
        for(int i =0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='('){
                counter++;
            }else{
                if(--counter<0)
                    return 0;
            } 
        }
        return counter==0?1:0;
    }
}