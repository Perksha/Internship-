class Solution {
    public  static void mergesort(int[]  nums,int l,int r){
        if(l>=r) return;
            int mid=(l+r)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);
            merge(nums,l,mid,r);
    }
    public static void merge(int[] nums,int l,int mid,int r){
        int s1=l;
        int e1=mid;
        int s2=mid+1;
        int e2=r;
        int idx=0;
        int arr[]=new int[r-l+1];
        while(s1<=e1&&s2<=e2){
            if(nums[s1]<nums[s2]){
                arr[idx++]=nums[s1++];
            }else{
                arr[idx++]=nums[s2++];
            }
        }
        while(s1<=e1){
            arr[idx++]=nums[s1++];
        }
        while(s2<=e2){
            arr[idx++]=nums[s2++];
        }
        for(int i=0;i<arr.length;i++){
            nums[l+i]=arr[i];
        }
    }
    public void sortColors(int[] nums) {
      mergesort(nums,0,nums.length-1);  
    }
}

