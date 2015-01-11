import java.util.Stack;
class StoneWall {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int counter = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i =0;
        while(i<H.length){
            int current = H[i];
            if(current>(stack.empty()?0:stack.peek())){
                counter++;
                stack.push(current);
                i++;
            }else if(current==stack.peek()){
                i++;
            }else{
                //current<stack.peek()
                stack.pop();
            }
        }
        return counter;
    }
}