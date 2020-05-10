package arrays.easy;

public class Problem_1304 {

    public int[] sumZero(int n) {
        int[] arr = new int[n];
      
        	// start from [1,2,3, -1,-2,-3]
            for(int i = 0; i <= n/2; i++){
                arr[i] = i+1;
                arr[n - i -1] = -(i+1);
            }
        
        if(n%2 != 0){
            arr[n/2] = 0;
        }
    return arr;
    }
}
