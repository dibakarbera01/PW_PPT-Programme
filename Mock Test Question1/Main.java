import java.util.*;
public class Main {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while (count < n) {
            nums[count] = 0;
            count++;
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();
            int[] nums = new int[length];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                nums[i] = scanner.nextInt();
            }
            moveZeroes(nums);
            System.out.println("Output: " + Arrays.toString(nums));
        }
    }
}