class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        for(int i=n-1; i>0; i--){
            Arrays.sort(stones);
            stones[i-1] = stones[i] - stones[i-1];
        }
        return stones[0];
    }
}