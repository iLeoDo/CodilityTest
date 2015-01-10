class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int lower = (int)Math.ceil((double)A/K);
        int upper = (int)Math.floor((double)B/K);
        return upper-lower+1;
    }
}