import java.util.Arrays;
class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // A empty/only one
        int len = A.length;
        int[] left = new int[len];
        int[] right = new int[len];
        for(int i=0;i<len;i++)
            left[i] = i+A[i];
            right[i] = i-A[i];
        }
        Arrays.sort(left);
        Arrays.sort(right);
        
        for(int i=0;i<len;i++)
            
        }
        
    }

}