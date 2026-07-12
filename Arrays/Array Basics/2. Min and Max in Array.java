class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele<minEle  ){
                minEle = ele;
            }
            if(ele > maxEle){
                maxEle = ele;
            }
        }
        ArrayList<Integer> res = new ArrayList();
         res.add(minEle);
         res.add(maxEle);
         
         return res;

    }
}


//Solution 2 :
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        //using InbuiltFunction
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
