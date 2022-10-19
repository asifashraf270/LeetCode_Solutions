public class Problem5 {
    public static void main(String[] args){
        int[] input={1,2,2,1};
        System.out.println(removeDuplicate(input));
        /*for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }*/
        //System.out.println(removeDuplicate(input).toString());
    }

    public static int removeDuplicate(int[] nums){
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;


    }


}



