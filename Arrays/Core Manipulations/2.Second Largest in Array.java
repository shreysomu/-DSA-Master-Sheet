class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // int l1 = -1;
        // int l2 = -1;
        // int n = arr.length;
        
        // for(int i = 0;i<n;i++){
        //     if(arr[i] > l1)
        //     l1 = arr[i];
        // }
        
        // for(int i = 0;i<n;i++){
        //     if(l2<arr[i] && arr[i] != l1)
        //     l2 = arr[i];
        // }
        // return l2;
        
        
        //2nd way
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int ele : arr){
            if(ele > largest){
                secondLargest = largest;
                largest = ele;
            }
            else if(ele > secondLargest && ele != largest )
            secondLargest = ele;
        }
        
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
