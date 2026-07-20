class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
      for (int num : arr) {

            int original = num;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            if (reverse != original)
                return false;
        }

        return true;
    }
}







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
