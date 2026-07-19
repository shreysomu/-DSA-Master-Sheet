class Solution {
    void segregate0and1(int[] arr) {
        // code here
        //inBuilt function;
      //  Arrays.sort(arr);
        
        //Without Inbuilt function
        
        int s = 0;
        int e = arr.length - 1;
        
        while(e > s){
            if(arr[s] == 0)
            s++;
            else if(arr[e] == 1){
                e--;
            }
            else if(arr[s] == 1 && arr[e] == 0){
                //swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
    }
}
