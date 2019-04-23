public class Solution {
    /**
     * @param A: an array
     * @return: total of reverse pairs
     */
    public long reversePairs(int[] A) {
        // write your code here
        int i=0;
        int j=1;
        long count = 0;
        
        while(i < A.length-1) {
            while(j < A.length) {
                if(A[i] > A[j])
                    count++;
            }
            i++;
            j++;
        }
        
        return count;
    }
}

// time limit exceed
