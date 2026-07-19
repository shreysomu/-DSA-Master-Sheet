class Solution {
    public void reverseArray(int arr[]) {
        // code here
        //using temp variable
        
        int s = 0;
        int e = arr.length - 1;
        
        while(e>=s){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        
    }
}
