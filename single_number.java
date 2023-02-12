public class single_number {
        public int singleNumber(int[] nums) {
            int x=0;
            for (int num : nums){
                x =  x ^num;
            }
         return x;   
        }
    }
}
