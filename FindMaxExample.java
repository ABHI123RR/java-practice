public class FindMaxExample {

    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

        public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        int maxValue = findMax(numbers);
        System.out.println("The maximum value is: " + maxValue);
    }
}
