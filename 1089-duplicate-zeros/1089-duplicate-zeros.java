class Solution {
    public void duplicateZeros(int[] arr) {
        int num[] = new int[arr.length];
        int index = 0 ;

        for( int i = 0 ; i < arr.length ; i ++ ){
            if( index >= arr.length ){
                break ;
            }
            if( arr[i] != 0 ){
                num[index] = arr[i];
                index = index + 1 ;
            }
            else if( arr[i] == 0 ){
                num[index] = 0 ;
                index = index + 1 ;

                if( index < arr.length ){
                    num[index] = 0 ;
                    index = index + 1 ;
                }
            }
        }
        for( int i = 0 ; i < arr.length ; i ++ ){
            arr[i] = num[i] ;
        }
    }
}