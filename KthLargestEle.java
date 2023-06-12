class Solution {
    public int[] kLargest(int[] arr, int n, int k) {
        int[] result = new int[k];
        
        Arrays.sort(arr);
        
        int j = 0;
        for (int i = n - 1; j < k; i--) {
            result[j] = arr[i];
            j++;
        }
        
        return result;
}
}
