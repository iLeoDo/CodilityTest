// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class EquiLeader {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0){
            return 0;    
        }

        int count = 0;
        int leader = A[0];
        
        for(int i=0;i<A.length;i++){
            if(count==0){
                leader=A[i];
                count++;
            }else if(leader==A[i]){
                count++;
            }else{
                count--;    
            }
        }

        int[] countLeader = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(leader==A[i]){
                countLeader[i] = (i-1>=0)?countLeader[i-1]+1:1;
            }else{
                countLeader[i]= (i-1>=0)?countLeader[i-1]:0;
            }
        }
        
        int total = countLeader[A.length-1];
        
        if(total<=A.length/2)
            return 0;

        int res = 0;
        for(int i=0;i<A.length-1;i++){
            if(countLeader[i]>(i+1)/2&&(total-countLeader[i])>(A.length-1-i)/2){
                res++;
            }
        }
        return res;
    }
}
