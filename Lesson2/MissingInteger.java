import java.util.HashMap;
class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        
        map.put(1,true);
        for(int i = 0;i<A.length;i++){
            if(A[i]+1>0)
                map.put(A[i]+1,true);
        }
        for(int i = 0;i<A.length;i++){
            map.remove(A[i]);
        }
        int minPos = Integer.MAX_VALUE;
        for(Integer i : map.keySet()){
            minPos = Math.min(i,minPos);  
        }
        return minPos;
    }

    public int solution2(int[] A){
        //Pigeonhole principle.
        int[] pige = new int[A.length+1];
        for(int i = 0;i<A.length;i++){
            if(A[i]>0&&A[i]<A.length+1)
                pige[A[i]]=1;
        }
        for(int i = 1;i<A.length+1;i++){
            if(pige[i]==0){
                return i;
            }
        }
        return A.length+1;

    }
}