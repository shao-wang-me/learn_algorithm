package problems;

import java.util.Arrays;

class Array {
    /** Right shift one step. Time: O(n), space: O(1). */
    static void shift(int[] nums) {
        int p = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int q = nums[i + 1];
            nums[i + 1] = p;
            p = q;
        }
        nums[0] = p;
    }

    /** Right rotate k steps. */
    static void rotate(int[] nums, int k) {

    }

    static int sum(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        return sum;
    }

    static double average(int[] nums) {
        return (double) sum(nums) / nums.length;
    }

    static void reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    static void print(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};

        shift(nums);
        print(nums);

        nums = new int[]{1};
        shift(nums);
        print(nums);

        nums = new int[]{1, 2};
        shift(nums);
        print(nums);

        nums = new int[]{1, 2, 3, 4, 5};
        reverse(nums);
        print(nums);

        double avg = average(nums);
        System.out.println(avg);
    }
}