class Solution {
    public int[] twoSum(int[] a, int target) {
     int n = a.length;

    for (int i=0; i<n; i++) {
        for (int j=i + 1; j<n; j++) {
            if (a[i]+ a[j] == target) {
                int[] ans =new int[2];
                ans[0] =i;
                ans[1] =j;
                return ans;
            }
        }
    }
                int[] ans =new int[2];
                ans[0] =0;
                ans[1] =0;
                return ans;    
}
}