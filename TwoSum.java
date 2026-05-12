import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);
        if (result!= null) {
            System.out.println(
                    "Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
        scanner.close();

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            map.put(nums[i], i);
        }

        return null;

    }
}
