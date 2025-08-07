import java.util.Scanner;
public class FindDuplicateEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        int n = sc.nextInt();
        int[] nums = new int[n];
        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Check for duplicates using nested loops
        int duplicate = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = nums[i];
                    break; // Exit inner loop
                }
            }
            if (duplicate != -1) {
                break; // Exit outer loop
            }
        }
        // Print result
        System.out.println(duplicate);
    }
}
