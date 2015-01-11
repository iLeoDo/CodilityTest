import java.util.Arrays;
class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 0;
        int last = -1;
        for(int i=0;i<A.length;i++){
            if(A[i]!=last){
                count++;
                last = A[i];
            }
        }
        return count;
    }

}