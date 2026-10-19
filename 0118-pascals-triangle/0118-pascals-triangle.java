class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        for( int i = 0 ; i < numRows ; i ++ ){
            long  ans = 1 ;

            List<Integer> list2 = new ArrayList<>();
            list2.add((int)ans);
            for( int j = 1 ; j <= i ; j ++){
                ans = ans * ( i - j + 1);
                ans = ans / j ;
                list2.add((int)ans);
            }
            list.add(list2);

        }
        return list;
    }
}