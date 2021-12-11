package power.of.three;

public class Power_Of_Three {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int insertPosition = 0;
        for (Integer number : nums) {
            if (number != 0) {
                nums[insertPosition] = number;
                insertPosition++;
            }
        }
        while (insertPosition < nums.length) {
            nums[insertPosition] = 0;
            insertPosition++;
        }

    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12}; //example
        moveZeroes(ints);
    }
}
