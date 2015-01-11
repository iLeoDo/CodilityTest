class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int max = Integer.MIN_VALUE;
        max = Math.max(max,A[0]*A[1]*A[A.length-1]);
        max = Math.max(max,A[A.length-3]*A[A.length-2]*A[A.length-1]);
        return max;
    }
}