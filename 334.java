class Vishal334 {

    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int right = nums[i];
            if (right < left) {
                left = right;
            } else if (right < middle && right > left) {
                middle = right;
            } else if (right > middle && right > left) {
                System.out.println(left+" "+middle+" "+right);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 4, 10 };
        boolean result = increasingTriplet(arr);
        System.out.println("Result : " + result);
        System.out.println("Code is running");
    }

}
