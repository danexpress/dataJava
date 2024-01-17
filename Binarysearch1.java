public class Binarysearch1 {
    public static void main(String[] args) {

        int nums[] = { 5, 6, 7, 9, 11, 13 };
        int target = 9;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length - 1);

        if (result1 != -1) {
            System.out.println("Element found at Index : " + result1);
            System.out.println("Element found at Index : " + result2);
        } else
            System.out.println("Element not found");

    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("steps taken by Linear :" + i);
                return i;
            }
        }
        System.out.println("steps taken by Linear: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearch(nums, target, mid + 1, right);
            else
                return binarySearch(nums, target, left, mid - 1);
        }
        return -1;
    }

}