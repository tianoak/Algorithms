public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here

        int len = A.length + B.length;
        int[] merge = new int[len];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<A.length && j<B.length) {
            if(A[i] < B[j]) {
                merge[k++] = A[i++];
            } else {
                merge[k++] = B[j++];
            }
        }
        
        while(i<A.length)
           merge[k++] = A[i++];
        while(j<B.length)
           merge[k++] = B[j++];
        
        return merge;
    }
}
