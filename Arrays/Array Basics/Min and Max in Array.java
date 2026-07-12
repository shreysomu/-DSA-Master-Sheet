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
