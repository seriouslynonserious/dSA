import java.util.Scanner;

public class MovesZeroesToEnd {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size=scanner.nextInt();
    int [] nums=new int [size];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<size;i++){
        nums[i]=scanner.nextInt();

    }
    MoveZeroes(nums);
    System.out.println("Array after moving zeroes to the end:");
    for (int num : nums) {
        System.out.print(num + " ");    
    }
    scanner.close();

}
public static void MoveZeroes(int [] nums){
     int nonZeroIndex=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[nonZeroIndex] = nums[i];
            nonZeroIndex++;
        }
     }
     while(nonZeroIndex < nums.length){
        nums[nonZeroIndex] = 0;
        nonZeroIndex++;
     }

}
}