import java.util.Arrays;
class Triangle {
    public int solution(int[] A) {
        if(A.length<3){
            return 0;
        }
        Arrays.sort(A);
        for(int i=0;i<A.length-2;i++){
            if(isTriangular((long)A[i],(long)A[i+1],(long)A[i+2]))
                return 1;
        }
        return 0;
    }
    public boolean isTriangular(long a, long b , long c){
        return a>0&&b>0&&c>0&&a+b>c&&b+c>a&&a+c>b;
    }
}