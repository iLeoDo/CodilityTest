import java.util.LinkedList;
class Fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for(int i=0;i<A.length;i++){
            if(stack.size()==0){
                //empty
                stack.push(i);
            }else{
                while(true){
                    if(stack.size()==0){
                        stack.push(i);
                        break;
                    }
                    int topFish = stack.peek();
                    if(B[topFish]==1&&B[i]==0){
                        //face
                        if(A[topFish]>A[i]){
                            break;
                        }else{
                            stack.pop();
                        }
                    }else{
                        stack.push(i);
                        break;
                    }   
                }    
            }    
        }
        return stack.size();
    }
}