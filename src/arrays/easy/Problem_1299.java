package arrays.easy;

public class Problem_1299 {

	    public int[] replaceElements(int[] arr) {
	        
	        int max = Integer.MIN_VALUE;
	        int[] output = new int[arr.length];
	        
	        //Come from end of the array and keep checking the maximum and fill new output array
	        for (int i = arr.length-1; i >= 0; i--) {
	            if (i == arr.length-1) output[i] = -1;
	            else {
	                output[i] = max;
	            }
	            max = Math.max(arr[i], max);
	        }
	        return output;
	    }

	
}
