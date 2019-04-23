public class LintCode532v2 {
    /**
     * @param A: an array
     * @return: total of reverse pairs
     */
    public long reversePairs(int[] A) {
        // write your code here

        long count = mergeSort(A, 0, A.length-1);        
        return count;
    }
    
    public int mergeSort(int[] A, int i, int j) {
        int count = 0;
        while(i<j) {
            int mid = (i+j)/2;
            mergeSort(A, i, mid);
            mergeSort(A, mid+1, j);
            count += merge(A, i, mid, j);
        }
        return count;
    }
    
    public int merge(int[] A, int left, int mid, int right) {
        int count = 0;
        int[] result = new int[right-left+1];
        int i=mid;
        int j=mid+1;
        int k =left;
        
        while(i > left && j < right) {
            if(A[i] <= A[j]) {
                result[k++] = A[i--];
            } else {
                result[k++] = A[j++];
                count++;
            }
        }
        while(left <= right) {
            A[left] = result[left];
            left++;
        }
        return count;
    }

    public static void main(String[] args) {
        LintCode532v2 lc532 = new LintCode532v2();
        int A[] = {2,4,1,3,5};
        System.out.println(lc532.reversePairs(A));
    }
    
}
