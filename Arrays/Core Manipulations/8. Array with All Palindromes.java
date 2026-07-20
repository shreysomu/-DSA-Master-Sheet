class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i = 0;i<arr.length;i++){
            int ele = arr[i];
            int sum = 0;
            
            while(true){
                int d = ele%10;
                ele /= 10;
                
                sum += d;
                if(ele==0)
                break;
                
                sum *= 10;
            }
            
            if(sum != arr[i])
            return false;
        }
        return true;
    }
}
