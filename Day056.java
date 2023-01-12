/* Given an array nums of size n, return the majority element. 
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
that the majority element always exists in the array.
Sample Input 1 : nums = [3,2,3]
Sample Output 1 : 3
Sample Input 2 : nums = [2,2,1,1,1,2,2]
Sample Output 2 : 2
Constraints (extra Conditions):
● n == nums.length
● 1 <= n <= 5 * 104
● -109 <= nums[i] <= 109
SOLUTION */


public class Solution2 {
	
	private static int countInRange(int[] nums, int num, int lo, int hi) {
		int count = 0;
		for (int i = lo; i <= hi; i++) {
			
		  if (nums[i] == num) {
		
		    count++;
		   }
		}
		return count;
		 }
	private static int majorityElementRec(int[] nums, int lo, int hi) {
		
		if (lo == hi) {
			
		  return nums[lo];
		}
		int mid = (hi-lo)/2 + lo;
		int left = majorityElementRec(nums, lo, mid);
		int right = majorityElementRec(nums, mid+1, hi);
		
		if (left == right) {
			
		 return left;
	}
		int leftCount = countInRange(nums, left, lo, hi);
		int rightCount = countInRange(nums, right, lo, hi);
		
		   return leftCount > rightCount ? left : right;
		      }
	public static int majorityElement(int[] nums) {
			
		return majorityElementRec(nums, 0, nums.length-1);
		}
		public static void main(String args[]) {
		int nums[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
		       }
		}


