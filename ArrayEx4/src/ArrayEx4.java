import java.util.Arrays;


public class ArrayEx4 {
	public static int[] rotateLeft3(int[] nums){
		int new0 = nums[0 + 1];
		int new1 = nums[1 + 1];
		int new2 = nums[0];
		int[] newArr = new int[]{new0, new1, new2};
		
		return newArr;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{1, 2, 2};
		int[] array2 = new int[]{5, 11, 9};
		int[] array3 = new int[]{7, 0, 0};
		
		System.out.println(Arrays.toString(rotateLeft3(array1)));
		System.out.println(Arrays.toString(rotateLeft3(array2)));
		System.out.println(Arrays.toString(rotateLeft3(array3)));
	}
}
