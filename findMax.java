public class findMax {
    public int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // Add this main method to run the program
    public static void main(String[] args) {
        findMax fm = new findMax();
        int[] array = {5, 3, 8, 2, 7};
        System.out.println("Max value is: " + fm.findMax(array));
    }
}
