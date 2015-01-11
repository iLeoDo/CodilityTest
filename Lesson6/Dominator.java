class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0)
            return -1;
        int count = 0; //like the size of stack
        int element = A[0]; //like the top element in stack
        
        for(int i:A){
            if(i==element)
                count++;
            else{
                if(count==0){
                    count++;
                    element = i;
                }    
                else count--;
            }
        }
        
        int ct = 0;
        int index = -1;
        for(int i=0;i<A.length;i++){
            if(A[i]==element)  {
                ct++;
                index = i;
            } 
        }
        if(ct>A.length/2)return index;
        else return -1;
    }
}