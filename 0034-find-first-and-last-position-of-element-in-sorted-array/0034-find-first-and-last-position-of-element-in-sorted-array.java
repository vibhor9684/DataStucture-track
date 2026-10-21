class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerbond(nums,target,n);
        if(lb==n || nums[lb]!=target) return new int[]{-1, -1};
        int ub = upperbond(nums,target,n);
        return new int[] {lb,ub-1};
    }
        private int lowerbond(int[] nums,int target,int n){
            int low=0;
            int high=n-1;
            int ans=n;
            while(low<=high){
               int mid=low+(high-low)/2;
                if(nums[mid]>=target){
                    high=mid-1;
                    ans=mid;
                }else{
                    low=mid+1;
                }
            }
            return ans;
        }

        private int upperbond(int[] nums,int target,int n){
            int low=0;
            int high=n-1;
            int ans=n;
            while(low<=high){
               int mid=low+(high-low)/2;
                if(nums[mid]>target){
                    high=mid-1;
                    ans=mid;
                }else{
                    low=mid+1;
                }
            }
            return ans;
        }
    
}