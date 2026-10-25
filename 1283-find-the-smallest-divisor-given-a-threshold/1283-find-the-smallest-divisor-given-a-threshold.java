class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        Arrays.sort(nums);

        int low = 1 ;
        int high = 0 ;
        
        
        for( int num : nums){
            high = Math.max( num , high );
        }
        int ans = -1 ;
        while( low <= high ){
            int mid = low + ( high - low )/2 ;
            int sum = 0;

            for(  int num : nums){
                sum = sum + ( num + mid -1 )/ mid ;
            }

            if( sum <= threshold){
                ans = mid ;
                high = mid - 1 ;
            }
            else{
                low = mid + 1 ;
            }
        }
        return ans ;
    }
}