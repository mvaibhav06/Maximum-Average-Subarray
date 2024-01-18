public class MaxAverageSubArray {
    public static double findMaxAverage(int[] nums, int k){
        double sum = 0;
        double maxAverage = 0;

        for (int i=0; i<k; i++){
            sum += nums[i];
        }

        maxAverage = sum/k;

        for (int i=k; i<nums.length; i++){

            sum = sum - nums[i-k] + nums[i];
            double avg = sum/k;
            if (avg > maxAverage){
                maxAverage = avg;
            }

        }
        return maxAverage;
    }
    public static void main(String[] args) {

        int[] nums = {5};
        System.out.println(findMaxAverage(nums,1));
    }
}
