import java.util.*;

public class ThreeSum {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums =new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++){
            nums[i]=scanner.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();
        threeSum(nums,target);
        scanner.close();
        
    } 
    public static void threeSum(int[]nums, int target){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
             int left=i+1;
             int right=nums.length-1;
             while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    System.out.println("Triplet found: " + nums[i] + ", " + nums[left] + ", " + nums[right]);
                    break;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
             }
        }
    
        System.out.println("No triplet found that sums to the target.");
    }
    

}