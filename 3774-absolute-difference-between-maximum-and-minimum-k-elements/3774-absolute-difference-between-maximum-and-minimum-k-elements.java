class Solution {
    public int absDifference(int[] arr, int k) {
        Arrays.sort(arr);
        int smallSum = 0, largeSum = 0;
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            smallSum += arr[i];           
            largeSum += arr[n - 1 - i];   
        }
        return Math.abs(largeSum - smallSum);
    }
}